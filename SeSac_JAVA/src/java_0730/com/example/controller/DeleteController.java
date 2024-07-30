package java_0730.com.example.controller;
import java_0730.com.example.model.PatientDAO;
import java_0730.com.example.model.PatientDAOImpl;
import java.io.IOException;
import java.sql.SQLException;

public class DeleteController {
    private PatientDAO pDao;

    public DeleteController() throws IOException {
        this.pDao = new PatientDAOImpl();
    }

    public boolean delete(int number) throws SQLException {
        boolean isSuccess = false;
        try {
            isSuccess = pDao.deletePatient(number);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return isSuccess;
    }
}


