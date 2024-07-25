package java_0724.com.example;

import java_0723.DBClose;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Output extends Object {
    private Connection conn;
    private List<StudentVO> list;   //field

    public Output(List<StudentVO> list) throws IOException {
        this.list = list;
        DBConnection dbconn = new DBConnection();
        this.conn = dbconn.getConnection(); // 1~3
    }

    void output() throws SQLException {
        Statement stmt = null;
        for (StudentVO std : this.list) {
            try {
                stmt = this.conn.createStatement();
                String sql = "INSERT INTO Student ";
                sql += "VALUES ('" + std.getHakbun() + "', '" + std.getName() + "', ";
                sql += std.getKor() + ", " + std.getEng() + ", " + std.getMat() + ", " + std.getEdp() + ", " + std.getTot() + ", " + std.getAvg();
                sql += ", '" + std.getGrade() + "');";
                System.out.println("sql : " + sql);
                stmt.executeUpdate(sql);

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        };
        DBClose.dbClose(this.conn, stmt); // 7
        System.out.println("DB Inserted Successfully");
    }
}
