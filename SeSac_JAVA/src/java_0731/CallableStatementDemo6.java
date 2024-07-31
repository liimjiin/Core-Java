package java_0731;

import java.sql.*;
import java.util.Scanner;
/*
-- 부서번호를 입력받아 해당 부서의 직원들을 모두 출력하라
DELIMITER $$
CREATE PROCEDURE sp_select_emp_dept
(
	IN	v_deptno	TINYINT
)
BEGIN
	SELECT empno, ename, dname, loc, dept.deptno
    FROM emp NATURAL JOIN dept
    WHERE deptno = v_deptno;
END $$
DELIMITER ;

CALL sp_select_emp_dept(20);
 */

public class CallableStatementDemo6 {
    public static void main(String[] args) throws SQLException {
        DBConnection dbConn = new DBConnection();
        Scanner sc = new Scanner(System.in);
        Connection conn = dbConn.getConnection(); // 1, 2, 3
        String sql = "{ call sp_select_emp_dept(?) }"; // 불완전 SQL
        CallableStatement cstmt = null;
        ResultSet rs = null;

        try {
            cstmt = conn.prepareCall(sql); // 4
            System.out.print("부서 번호 : ");
            int deptno = sc.nextInt();
            cstmt.setInt(1, deptno); // SQL 문장 완성
            rs = cstmt.executeQuery(); // ResultSet으로 결과를 반환 받을 때 사용
            boolean flag = rs.next(); // 다음 레코드가
            if (!flag) { // 레코드가 한개도 없다면 false
                System.out.println("검색 결과가 없습니다.");
            }else{ // 하나 이상 있는 경우
                do{
                    System.out.printf("%d\t%s\t%s\t%s%n", rs.getInt("empno"),
                            rs.getString("ename"), rs.getString("dname"),
                            rs.getString("loc"));
                }while (rs.next()); // 더 있는 경우 계속 반복
            }
        } catch (SQLException e) {
            System.out.println("실패");
        }
        DBClose.dbClose(conn, cstmt, rs); // 7
    }

}
