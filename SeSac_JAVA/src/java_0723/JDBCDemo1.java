package java_0723;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {
    public static void main(String[] args) throws SQLException, IOException {
        DBConnection dbconn = new DBConnection();
        Connection conn = dbconn.getConnection();
        Statement stmt = null;
        ResultSet rs = null;

        try {
            stmt = conn.createStatement(); // 4단계
            StringBuffer sb = new StringBuffer();
            sb.append("SELECT e.empno, e.ename, e.sal, d.deptno, d.dname, d.loc ");
            sb.append("FROM emp e JOIN dept d ON(e.deptno = d.deptno) ");
            sb.append("WHERE e.ename = 'SMITH'");
            rs = stmt.executeQuery(sb.toString()); // 5단계
            while(rs.next()){
                System.out.printf("%d\t%s\t%.1f\t%d\t%s\t%s%n",
                        rs.getInt("empno"), rs.getString("ename"),
                        rs.getDouble("sal"), rs.getInt("d.deptno"),
                        rs.getString("dname"), rs.getString("loc"));
                System.out.println("출력!");

            }
        } catch (SQLException e) {

        }finally {
            DBClose.dbClose(conn);
        }
    }
}
