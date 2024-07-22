package java_0719.Earthquake;

public class Patient {
    private int num;
    private String dept;
    private int days;
    private int age;
    private int consultationFee;    // 진찰비
    private int hospitalizationFee; // 입원비
    private int medicalFee; // 진료비

    public Patient(int num, String dept, int days, int age) {
        this.num = num;
        this.dept = dept;
        this.days = days;
        this.age = age;
    }

    public int getNum() {
        return num;
    }

    public String getDept() {
        return dept;
    }

    public int getDays() {
        return days;
    }

    public int getAge() {
        return age;
    }

    public int getConsultationFee() {
        return consultationFee;
    }

    public int getHospitalizationFee() {
        return hospitalizationFee;
    }

    public int getMedicalFee() {
        return medicalFee;
    }

    public void setConsultationFee(int consultationFee) {
        this.consultationFee = consultationFee;
    }

    public void setHospitalizationFee(int hospitalizationFee) {
        this.hospitalizationFee = hospitalizationFee;
    }

    public void setMedicalFee(int medicalFee) {
        this.medicalFee = medicalFee;
    }

    @Override
    public String toString() {
        return String.format(
                "%d%7s%9d%9d%9d",
                num, dept, consultationFee, hospitalizationFee, medicalFee
        );
    }
}