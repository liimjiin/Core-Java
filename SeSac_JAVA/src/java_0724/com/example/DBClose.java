package java_0724.com.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBClose {
    public static void dbClose(Connection conn) throws SQLException {
        if(conn != null){
            conn.close();
        }
    }
    public static void dbClose(Connection conn, Statement stmt) throws SQLException {
        if(stmt != null){
            stmt.close();
        }
        if(conn != null){
            conn.close();
        }
    }
    public static void dbClose(Connection conn, Statement stmt, ResultSet rs) throws SQLException {
        if(rs != null){
            rs.close();
        }
        if(stmt != null){
            stmt.close();
        }
        if(conn != null){
            conn.close();
        }
    }
}
