package java_0725.com.example.controller;

import java_0725.com.example.model.PatientDAO;
import java_0725.com.example.model.PatientDAOImpl;
import java_0725.com.example.model.PatientVO;

import java.io.IOException;
import java.sql.SQLException;

public class InsertController { // view에게 받아
    private PatientDAO pDao;

    public InsertController() throws IOException {
        pDao = new PatientDAOImpl();
    }

    public boolean insert(PatientVO p) {
        boolean result = false;
        try {
            CalcController cc = new CalcController(p);
            result = pDao.createPatient(p);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

}
