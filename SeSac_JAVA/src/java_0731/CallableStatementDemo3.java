package java_0731;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import static java.lang.System.in;
/*
DELIMITER $$
CREATE PROCEDURE sp_insertDept
(
	IN v_deptno 	TINYINT,
    IN v_dname 		VARCHAR(14),
    IN v_loc		VARCHAR(13)
)
BEGIN
	INSERT INTO dept_clone(deptno, dname, loc)
    VALUES (v_deptno, v_dname, v_loc);
    COMMIT;
END
$$
DELIMITER ;
 */

public class CallableStatementDemo3 {
    public static void main(String[] args) throws SQLException {
        DBConnection dbConn = new DBConnection();
        Scanner sc = new Scanner(System.in);
        Connection conn = dbConn.getConnection(); // 1, 2, 3
        String sql = "{ call sp_insertDept(?, ?, ?) }"; // 불완전 SQL
        CallableStatement cstmt = null;

        try {
            cstmt = conn.prepareCall(sql); // 4
            System.out.println("부서번호 : ");
            int deptno = sc.nextInt();
            System.out.println("부서이름 : ");
            String dname = sc.next();
            System.out.println("부서위치 : ");
            String loc = sc.next();

            // IN parameter : setXxx() 사용
            cstmt.setInt(1, deptno);
            cstmt.setString(2, dname);
            cstmt.setString(3, loc);
            cstmt.execute(); // 5
            System.out.println("입력 성공");
        }catch (SQLException e){
            System.out.println("입력 실패");
        }

        DBClose.dbClose(conn, null); // 7
    }

}
