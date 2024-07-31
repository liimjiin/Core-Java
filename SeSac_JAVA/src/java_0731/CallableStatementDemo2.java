package java_0731;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
/*
DELIMITER //
CREATE PROCEDURE sp_deleteDept()
BEGIN
	DELETE FROM dept_clone;
END
//
DELIMITER ;
 */

public class CallableStatementDemo2 {
    public static void main(String[] args) throws SQLException {
        DBConnection dbConn = new DBConnection();
        Connection conn = dbConn.getConnection(); // 1, 2, 3

        try { // 파라미터 없는
            String sql = "{ call sp_deleteDept()}"; // 4
            CallableStatement cstmt = conn.prepareCall(sql); // 4
            cstmt.execute(); // 5
            System.out.println("성공");
        }catch (SQLException e){
            System.out.println("실패");
        }

        DBClose.dbClose(conn, null); // 7
    }

}
