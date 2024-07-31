package java_0730.com.example.controller;
import java_0730.com.example.model.PatientDAO;
import java_0730.com.example.model.PatientDAOImpl;
import java_0730.com.example.model.PatientVO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class SelectController {
    private PatientDAO pDao;

    public SelectController() throws IOException {
        this.pDao = new PatientDAOImpl();
    }

    public List<PatientVO> selectAllPatient() {
        List<PatientVO> list = null;
        try {
            list = this.pDao.readAllPatient();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }

    public PatientVO selectPatient(int number) throws SQLException {
        PatientVO p = null;
        p = this.pDao.readPatient(number);
        return p;
    }
}
