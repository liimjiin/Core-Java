package java_0730.com.example.model;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// DAO (Data Access Object) : 데이터베이스와 상호 작용하기 위한 객체, DB의 CRUD 작업을 수행
public class PatientDAOImpl implements PatientDAO {
    private Connection conn;

    public PatientDAOImpl() throws IOException {
        DBConnection dbConn = new DBConnection();
        this.conn = dbConn.getConnection(); // 1~3단계
    }

    @Override
    public boolean createPatient(PatientVO p) throws SQLException {
        Statement stmt = this.conn.createStatement(); // 4단계
        StringBuffer sb = new StringBuffer();
        sb.append("INSERT INTO patient ");
        sb.append("VALUES (" + p.getNumber() + ", '" + p.getCode() + "', ");
        sb.append(p.getDays() + ", " + p.getAge() + ", '" + p.getDept() + "', " +
                p.getOperFee() + ", " + p.getHospitalFee() + ", " + p.getMoney() + ");");
        System.out.println(sb.toString());
        int su = stmt.executeUpdate(sb.toString()); // 5단계
        DBClose.dbClose(this.conn, stmt);
        return (su == 1) ? true : false;
    }

    @Override
    public PatientVO readPatient(int number) throws SQLException {
        String sql = "{ call cp_select_one_patient(?) }"; // 미완성 SQL
        CallableStatement cstmt = this.conn.prepareCall(sql); // 4
        cstmt.setInt(1, number); // SQL 완성
        ResultSet rs = cstmt.executeQuery(); // 5
        boolean flag = rs.next(); // 값이 없으면 false, 있으면 true
        PatientVO p = null;

        if(flag){ // 값이 있는 경우
            p = new PatientVO(rs.getInt("number"), rs.getString("code"),
                    rs.getInt("days"), rs.getInt("age"));
            p.setDept(rs.getString("dept"));
            p.setOperFee(rs.getInt("operfee"));
            p.setHospitalFee(rs.getInt("hospitalfee"));
            p.setMoney(rs.getInt("money"));

            p.setNumber(number);

        }else{ // 값이 없는 경우
        }
        return p;
    }

    @Override
    public List<PatientVO> readAllPatient() throws SQLException {
//        String sql = "SELECT number, dept, operfee, hospitalfee, money ";
//        sql += "FROM patient ORDER BY number DESC";
        String sql = "{ call sp_select_all_patient() }";
        CallableStatement cstmt = this.conn.prepareCall(sql); // 4
        ResultSet rs = cstmt.executeQuery(); // 5
        boolean flag = rs.next();
        List<PatientVO> list = new ArrayList<PatientVO>(); // capacity 10개 생성
        if (!flag) {
            // 한번도 add를 하지 않아서 list.size() == 0
        } else {
            do { // 6
                int number = rs.getInt("number");
                String dept = rs.getString("dept");
                int operfee = rs.getInt("operfee");
                int hospitalfee = rs.getInt("hospitalfee");
                int money = rs.getInt("money");
                PatientVO p = new PatientVO();
                p.setNumber(number);
                p.setDept(dept);
                p.setOperFee(operfee);
                p.setHospitalFee(hospitalfee);
                p.setMoney(money);
                list.add(p);
            }
            while (rs.next());
        }
        DBClose.dbClose(conn, cstmt, rs);
        return list;
    }


    @Override
    public boolean updatePatient(PatientVO p) throws SQLException {

        String sql = "{ call sp_update_patient(?, ?, ?, ?, ?, ?, ?, ?)}";
        CallableStatement stmt = conn.prepareCall(sql);
        stmt.setInt(1, p.getNumber());
        stmt.setString(2, p.getCode());
        stmt.setInt(3, p.getDays());
        stmt.setInt(4, p.getAge());
        stmt.setString(5, p.getDept());
        stmt.setInt(6, p.getOperFee());
        stmt.setInt(7, p.getHospitalFee());
        stmt.setInt(8, p.getMoney());
        stmt.execute(); // 5
        DBClose.dbClose(conn, stmt); // 7
        return true;
    }

    @Override
    public boolean deletePatient(int number) throws SQLException {
        String sql = "DELETE FROM patient WHERE number = ?"; // 불완전한 SQL문
        PreparedStatement pstmt = this.conn.prepareStatement(sql); // 4
        pstmt.setInt(1, number); // 완전한 SQL 문장
        int row = pstmt.executeUpdate(); // 5
        DBClose.dbClose(conn, pstmt); // 7
        return (row == 1) ? true : false;
    }
}
