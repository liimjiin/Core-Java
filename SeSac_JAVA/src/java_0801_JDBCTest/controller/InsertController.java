package java_0801_JDBCTest.controller;

import java_0801_JDBCTest.model.EmpDAO;
import java_0801_JDBCTest.model.EmpDAOImpl;
import java_0801_JDBCTest.model.EmpVO;

import java.io.IOException;
import java.sql.SQLException;

/*
 * Author : Jinhee Lim
 * When : Aug, 01, 2024
 * Objective : 입력받은 직원의 정보를 DB에 저장하기 위한 함수를 호출합니다.
 * Environment : Windows 10 22H2(OS build 19045.4651), openjdk 17.0.11, IntelliJ 2024.1.4
 */
public class InsertController { // view에게 받아
    private EmpDAO dao;

    public InsertController() throws IOException {
        dao = new EmpDAOImpl();
    }

    public boolean insert(EmpVO e) {
        boolean result = false;
        try {
            CalcController cc = new CalcController(e);
            result = dao.createEmp(e);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }
}
