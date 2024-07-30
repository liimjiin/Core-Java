package java_0730.com.example.model;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
        sb.append(p.getDays() + ", " + p.getAge() + ", '" + p.getDept() + "', " + p.getOperFee() + ", " + p.getHospitalFee() + ", " + p.getMoney() + ");");
        System.out.println(sb.toString());
        int su = stmt.executeUpdate(sb.toString()); // 5단계
        DBClose.dbClose(this.conn, stmt);
        return (su == 1) ? true : false;
    }

    @Override
    public PatientVO readPatient(int number) {
        return null;
    }

    @Override
    public List<PatientVO> readAllPatient() throws SQLException {
        String sql = "SELECT number, dept, operfee, hospitalfee, money ";
        sql += "FROM patient ORDER BY number DESC";
        Statement stmt = this.conn.createStatement(); //4
        ResultSet rs = stmt.executeQuery(sql); //5
        List<PatientVO> list = new ArrayList<PatientVO>();
        while (rs.next()) { // 6
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
        DBClose.dbClose(conn, stmt, rs);
        return list;
    }

    @Override
    public boolean updatePatient(PatientVO p) {
        return false;
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
