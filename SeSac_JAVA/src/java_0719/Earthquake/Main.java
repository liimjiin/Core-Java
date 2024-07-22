package java_0719.Earthquake;

import java.util.ArrayList;
import java.util.List;

/*
 * Author : Jinhee Lim
 * When : Jul, 19, 2024
 * Objective : Test_Hospital Mgmt
 * Environment : Windows 10 Pro, openjdk 17.0.11, IntelliJ 2024.1.4
 */
public class Main {
    public static void main(String[] args) {
        List<Patient> list = new ArrayList<Patient>();

        Input input = new Input(list);
        input.input();

//        Calc calc = new Calc(list);
//        calc.calc();

        Sort sort = new Sort(list);
        sort.sort();

        Output output = new Output(list);
        output.output();

        System.out.println("Bye~!");
    }
}
