package java_0730.com.example.controller;

import java_0730.com.example.controller.CalcController;
import java_0730.com.example.model.PatientDAO;
import java_0730.com.example.model.PatientDAOImpl;
import java_0730.com.example.model.PatientVO;

import java.io.IOException;
import java.sql.SQLException;

public class UpdateController {
    private PatientDAO dao;

    public UpdateController() throws IOException {
        this.dao = new PatientDAOImpl();
    }
    public boolean update(PatientVO p) {
        boolean flag = false;
        try {
            CalcController cc = new CalcController(p);
            dao.updatePatient(p);
            flag = true;
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
            flag = false;
        }
        return flag;

    }
}
