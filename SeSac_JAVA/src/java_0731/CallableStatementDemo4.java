package java_0731;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;
/*
-- 사원번호를 입력받아 부서이름과 부서위치를 출력하라.
DELIMITER $$
CREATE PROCEDURE sp_selectEmp
(
	IN v_empno	SMALLINT, // 들어가는 값
    OUT v_dname VARCHAR(14), // 출력되는 값 1
    OUT v_loc	VARCHAR(13) // 출력되는 값 2
)
BEGIN
	SELECT dname, loc INTO v_dname, v_loc
    FROM emp JOIN dept ON (emp.deptno = dept.deptno)
    WHERE empno = v_empno;
END $$
DELIMITER ;

-- OUT되는 값은 '@t_'로 바인딩이 필요
CALL sp_selectEmp(7369, @t_dname, @t_loc); // 호출
SELECT @t_dname, @t_loc; // 출력
 */

public class CallableStatementDemo4 {
    public static void main(String[] args) throws SQLException {
        DBConnection dbConn = new DBConnection();
        Scanner sc = new Scanner(System.in);
        Connection conn = dbConn.getConnection(); // 1, 2, 3
        String sql = "{ call sp_selectEmp(?, ?, ?) }"; // 불완전 SQL
        CallableStatement cstmt = null;

        try {
            cstmt = conn.prepareCall(sql); // 4
            System.out.print("사원번호 : ");
            int empno = sc.nextInt();

            // IN parameter : setXxx()
            // OUT parameter : resisterOutParameter()
            cstmt.setInt(1, empno); // IN parameter
            cstmt.registerOutParameter(2, Types.VARCHAR);
            cstmt.registerOutParameter(3, Types.VARCHAR); // SQL 완성
            cstmt.execute(); // 5

            System.out.println("부서명 : " + cstmt.getString(2));
            System.out.println("부서 위치 : " + cstmt.getString(3));
        }catch (SQLException e){
            System.out.println("실패");
        }

        DBClose.dbClose(conn, cstmt); // 7
    }

}
