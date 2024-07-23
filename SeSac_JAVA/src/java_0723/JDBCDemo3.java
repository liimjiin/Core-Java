package java_0723;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo3 {
    public static void main(String[] args) throws IOException, SQLException {
        String sql = "SELECT dept.deptno, dname, ROUND(AVG(sal),2), SUM(sal) ";
        sql += "FROM emp JOIN dept ON(emp.deptno = dept.deptno) ";
        sql += "GROUP BY deptno ORDER BY deptno DESC";

        Connection conn = new DBConnection().getConnection();
        Statement stmt = null;
        ResultSet rs = null;

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()){
                System.out.printf("%d\t%s\t%.2f\t,%d%n",rs.getInt("dept.deptno"),
                        rs.getString("dname"), rs.getDouble(3), rs.getInt(4));
            }
        } finally {
            DBClose.dbClose(conn, stmt, rs);
        }

    }
}
