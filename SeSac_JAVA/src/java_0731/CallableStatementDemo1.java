package java_0731;

import java.sql.*;
/*
DELIMITER //
CREATE PROCEDURE sp_test()
BEGIN
	SELECT NOW(), VERSION();
END
//
DELIMITER ;
 */

public class CallableStatementDemo1 {
    public static void main(String[] args) throws SQLException {
        DBConnection dbConn = new DBConnection();
        Connection conn = dbConn.getConnection(); // 1, 2, 3
        String sql = "{ call sp_test(?,?) }"; // SQL 미완성
        CallableStatement cstmt = conn.prepareCall(sql); // 4

        // OUT parameter : resisterOutParameter() 사용
        cstmt.registerOutParameter(1, Types.DATE);
        cstmt.registerOutParameter(2, Types.VARCHAR); // SQL 완성
        cstmt.execute(); // 5
        System.out.println(cstmt.getDate(1));
        System.out.println(cstmt.getString(2));
        DBClose.dbClose(conn, null); // 7
    }

}
