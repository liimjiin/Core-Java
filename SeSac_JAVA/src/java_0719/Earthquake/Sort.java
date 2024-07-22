package java_0719.Earthquake;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/*
 * Author : Jinhee Lim
 * When : Jul, 19, 2024
 * Objective : Test_Hospital Mgmt
 * Environment : Windows 10 Pro, openjdk 17.0.11, IntelliJ 2024.1.4
 */
public class Sort {
    private List<Patient> list;

    public Sort(List<Patient> list) {
        this.list = list;
    }

    public void sort() {
        Collections.sort(this.list, new Comparator<Patient>() {
            @Override
            public int compare(Patient front, Patient back) {
                return front.getNum() - back.getNum();
            }
        });
    }
}
