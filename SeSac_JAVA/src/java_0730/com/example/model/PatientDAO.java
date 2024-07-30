package java_0730.com.example.model;
import java.sql.SQLException;
import java.util.List;

public interface PatientDAO {
    /**
     * 새로운 환자를 등록한다. 이미 등록된 환자가 있다면 false를 리턴, 성공하면 true 리턴
     *
     * @param Patient
     * @return 등록을 성공하면 true, 그렇지 않으면 false
     */
    boolean createPatient(PatientVO p) throws SQLException;

    /**
     * 환자 등록 번호를 입력받아 해당 번호의 환자 한명을 리턴한다.
     *
     * @param 환자등록번호
     * @return 해당 환자 1명
     */
    PatientVO readPatient(int number);

    /**
     * 등록된 모든 환자 리스트를 반환한다.
     *
     * @return 환자형 리스트
     */
    List<PatientVO> readAllPatient() throws SQLException;

    /**
     * 수정할 환자정보를 입력받아 성공하면 true, 실패하면 false
     *
     * @param 수정할 환자
     * @return 성공 여부
     */
    boolean updatePatient(PatientVO p);

    /**
     * 환자 등록번호를 입력받아 해당 환자를 삭제
     *
     * @param 삭제 환자 등록번호
     * @return 성공여부
     */
    boolean deletePatient(int number) throws SQLException;
}
