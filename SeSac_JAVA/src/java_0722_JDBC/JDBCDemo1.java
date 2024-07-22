package java_0722_JDBC;
//[JDBC 7단계]
//1. java.sql Import
import java.sql.*;

public class JDBCDemo1 {
    public static void main(String[] args) {
        //2. MySQL Driver Loading
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Class Founded");
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found");
        }

        // 3. Memory에 loading된 MySQL Driver를 이용해 Connection
        String url = "jdbc:mysql://localhost:3306/mycompany";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, "root", "mymysql");
            System.out.println("Success");
        } catch (SQLException e) {
            System.out.println("Connection Failure");
        }

        // 4. Statement 객체 생성
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // 5. Statement 객체를 이용해 SQL 실행
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery("SELECT now(), version()"); // SELECT를 사용할 때만 executeQuery 사용
        } catch (SQLException e) {
            System.out.println("Query Syntax Error..");
        }

        // 6. ResultSet의 결과를 parsing
        try {
            rs.next();
            String now = rs.getString(1); // JDBC는 인덱스가 1부터 시작
            String version = rs.getString(2);
            System.out.println(now);
            System.out.println(version);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        // 7. Close
        try {
            if (rs != null) rs.close();
            if (stmt != null) rs.close();
            if (conn != null) rs.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
