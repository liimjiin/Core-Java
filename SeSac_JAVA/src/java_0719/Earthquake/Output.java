package java_0719.Earthquake;

import java.util.List;

/*
 * Author : Jinhee Lim
 * When : Jul, 19, 2024
 * Objective : Test_Hospital Mgmt
 * Environment : Windows 10 Pro, openjdk 17.0.11, IntelliJ 2024.1.4
 */
public class Output {
    List<Patient> list;
    Patient p;

    public Output(List<Patient> list) {
        this.list = list;
    }

    public void output() {
        label();
        for (Patient p : this.list){
            System.out.println(p);
        }
    }

    public void label(){
        System.out.println("\t\t\t<<병원 관리 프로그램>>\t\t\t");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("번호\t진찰부서\t진찰비\t입원비\t진료비\t");
        System.out.println("--------------------------------------------------------------------------");
    }
}
