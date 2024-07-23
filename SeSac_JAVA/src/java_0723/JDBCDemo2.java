package java_0723;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCDemo2 {
    private  DBConnection dbconn;
    private Connection conn;

    public JDBCDemo2() throws IOException {
        this.dbconn = new DBConnection();
        this.conn = this.dbconn.getConnection();
    }
    public static void main(String[] args) throws IOException, SQLException {
        JDBCDemo2 demo = new JDBCDemo2();
        Scanner sc = new Scanner(System.in);
        System.out.println("왓쬬넴?");
        String name = sc.next().toUpperCase();
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = demo.conn.createStatement(); // 4단계
            StringBuffer sb = new StringBuffer();
            sb.append("SELECT ename, sal, grade ");
            sb.append("FROM emp, salgrade ");
            sb.append("WHERE (sal BETWEEN losal AND hisal) AND ename = '"+name+"'");
            rs = stmt.executeQuery(sb.toString()); // 5단계

            while (rs.next()){ // 6단계
                System.out.printf("%s\t%.1f\t%d\t", rs.getString("ename"),
                        rs.getDouble("sal"), rs.getInt("grade"));

            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }finally {
            DBClose.dbClose(demo.conn,stmt,rs);
        }


    }
}
