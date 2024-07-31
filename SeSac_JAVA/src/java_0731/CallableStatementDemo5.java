package java_0731;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;
/*
부서 이름을 넣으면 부서 위치를 출력
DELIMITER $$
CREATE PROCEDURE sp_selectDname
(
	INOUT v_name VARCHAR(14)
)

BEGIN
	DECLARE v_str VARCHAR(14);
	SELECT loc INTO v_str
    FROM dept
    WHERE dname = v_name;
    SET v_name := v_str;
END $$
DELIMITER ;

SET @t_str := 'RESEARCH';
CALL sp_selectDname(@t_str);
SELECT @t_str;
 */

public class CallableStatementDemo5 {
    public static void main(String[] args) throws SQLException {
        DBConnection dbConn = new DBConnection();
        Scanner sc = new Scanner(System.in);
        Connection conn = dbConn.getConnection(); // 1, 2, 3
        String sql = "{ call sp_selectDname(?) }"; // 불완전 SQL
        CallableStatement cstmt = null;

        try {
            cstmt = conn.prepareCall(sql); // 4
            System.out.print("부서이름 : ");
            String dname = sc.next();
            cstmt.setString(1, dname);

            // INOUT은 동시에 registerOutParameter()도 사용해야 한다.
            cstmt.registerOutParameter(1, Types.VARCHAR);
            cstmt.execute();
            System.out.printf("%s의 위치는 %s입니다.", dname, cstmt.getString(1));
        } catch (SQLException e) {
            System.out.println("실패");
        }
        DBClose.dbClose(conn, cstmt); // 7
    }

}
