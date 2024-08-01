package java_0801_JDBCTest.main;
import java_0801_JDBCTest.view.EmpView;
import java.io.IOException;
import java.sql.SQLException;
/*
 * Author : Jinhee Lim, Hyerin Lim
 * When : Aug, 01, 2024
 * Objective : 실행을 담당하는 Main 클래스입니다.
 * Environment : Windows 10 22H2(OS build 19045.4651), openjdk 17.0.11, IntelliJ 2024.1.4
 */
public class Main {
    public static void main(String[] args) throws IOException, SQLException {
        new EmpView();
    }
}
