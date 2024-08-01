package java_0801_JDBCTest.controller;

import java_0801_JDBCTest.model.EmpDAO;
import java_0801_JDBCTest.model.EmpDAOImpl;
import java_0801_JDBCTest.model.EmpVO;

import java.sql.SQLException;
import java.util.List;

/*
 * Author : Jinhee Lim(selectController), Hyerin Lim(selectAllEmp)
 * When : Aug, 01, 2024
 * Objective : 입력받은 직원의 정보를 출력하기 위한 함수를 호출합니다.
 * Environment : Windows 10 22H2(OS build 19045.4651), openjdk 17.0.11, IntelliJ 2024.1.4
 */
public class SelectController { // select & select All
    private EmpDAO eDAO;

    public SelectController() {
        this.eDAO = new EmpDAOImpl();
    }

    public List<EmpVO> selectAllEmp() {
        List<EmpVO> list = null;

        try {
            list = this.eDAO.readAllEmp();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }
}
