package java_0719.Earthquake;

import java.util.List;
import java.util.Scanner;

/*
 * Author : Jinhee Lim
 * When : Jul, 19, 2024
 * Objective : Test_Hospital Mgmt
 * Environment : Windows 10 Pro, openjdk 17.0.11, IntelliJ 2024.1.4
 */
public class Input {
    private List<Patient> list;
    private Scanner sc;

    public Input(List<Patient> list) {
        this.list = list;
        this.sc = new Scanner(System.in);
    }

    public String findDeptByCode(String code){
        return switch (code) {
            case "MI" -> "외과";
            case "NI" -> "내과";
            case "SI" -> "피부과";
            case "TI" -> "소아과";
            case "VI" -> "산부인과";
            case "WI" -> "비뇨기과";
            default -> "잘못 입력하셨습니다.";
        };
    }

    public void input() {
        String io = null;
        do {
            System.out.println("환자의 정보를 입력해주세요.");
            System.out.print("번   호 : ");
            int num = Integer.parseInt(sc.nextLine());
            System.out.print("진료코드 : ");
            String code = sc.nextLine();
            System.out.print("입원일수 : ");
            int days = Integer.parseInt(sc.nextLine());
            System.out.print("나   이 : ");
            int age = Integer.parseInt(sc.nextLine());

            Patient p = new Patient(num, findDeptByCode(code), days, age);
            list.add(p);

            System.out.print("입력/출력(I/O)?");
            io = sc.nextLine();
        }while (io.equalsIgnoreCase("i"));
    }
}
