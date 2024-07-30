package java_0725.com.example.model;


import java_0725.com.example.model.DBClose;
import java_0725.com.example.model.DBConnection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
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
    public List<PatientVO> readAllPatient() {
        return null;
    }

    @Override
    public boolean updatePatient(PatientVO p) {
        return false;
    }

    @Override
    public boolean deletePatient(int number) {
        return false;
    }
}
