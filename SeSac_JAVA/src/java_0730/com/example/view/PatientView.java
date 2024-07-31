package java_0730.com.example.view;

import java_0730.com.example.controller.DeleteController;
import java_0730.com.example.controller.InsertController;
import java_0730.com.example.controller.SelectController;
import java_0730.com.example.controller.UpdateController;
import java_0730.com.example.model.PatientVO;

import javax.swing.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class PatientView {
    private Scanner scan;

    public PatientView() throws IOException, SQLException {
        this.scan = new Scanner(System.in);
        boolean isContinue = true;
        while (isContinue) {
            switch (showMenu()) {
                case 1:
                    insertMenu();
                    break;
                case 2:
                    selectMenu();
                    break;
                case 3:
                    selectAllMenu();
                    break;
                case 4:
                    updateMenu();
                    break;
                case 5:
                    deleteMenu();
                    break;
                case 0:
                    isContinue = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "잘못된 번호를 입력하셨습니다.");
            }
        }
    }

    private void updateMenu() throws SQLException, IOException {
        SelectController sc = new SelectController();
        selectAllMenu();
        System.out.println("환자 번호 : ");
        int number = scan.nextInt();
        PatientVO p = sc.selectPatient(number);
        if (p == null) { // 검색 결과가 없는 경우
            System.out.println("검색하신 환자를 찾을 수 없습니다.");
        } else {
            System.out.println("환자 번호ddd : " + p.getNumber());
            System.out.println("1. 진료 코드 : " + p.getCode());
            System.out.println("2. 입원 일수 : " + p.getDays());
            System.out.println("3. 환자 나이 : " + p.getAge());
            System.out.println("수정하실 항목의 번호를 입력해주세요 : ");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("수정 진료 코드 : ");
                    String code = scan.next();
                    p.setCode(code);
                    break;
                case 2:
                    System.out.print("수정 입원 일수 : ");
                    int days = scan.nextInt();
                    p.setDays(days);
                    break;
                case 3:
                    System.out.print("수정 환자 나이 : ");
                    int age = scan.nextInt();
                    p.setAge(age);
                    break;
            }
            UpdateController uc = new UpdateController();
            p.setNumber(number);
            boolean flag = uc.update(p);
            if (flag) {
                System.out.println("수정 완료");
            } else {
                System.out.println("수정 실패");
            }
        }
    }

    private void selectMenu() throws IOException, SQLException {
        SelectController sc = new SelectController();
        System.out.println("환자 번호를 입력해주세요 : ");
        int number = this.scan.nextInt();
        PatientVO p = sc.selectPatient(number);
        if (p == null) { // 검색 결과가 없는 경우
            System.out.println("검색하신 환자를 찾을 수 없습니다.");
        } else {
            System.out.printf("%d\t%s\t%d\t%d\t%d%n",
                    p.getNumber(), p.getDept(), p.getOperFee(), p.getHospitalFee(), p.getMoney());
        }
    }

    private void selectAllMenu() throws IOException {
        SelectController sc = new SelectController();
        List<PatientVO> list = sc.selectAllPatient();
        System.out.println("번호\t진찰부서\t진찰비\t입원비\t진료비");
        System.out.println("----------------------------------");
        if (list == null || list.size() == 0) {
            System.out.println("등록된 환자가 없습니다.");
        } else if (list.size() > 0) {
            list.forEach(p -> System.out.printf("%d\t%s\t%d\t%d\t%d%n",
                    p.getNumber(), p.getDept(), p.getOperFee(), p.getHospitalFee(), p.getMoney()));
        }
        System.out.println("----------------------------------");
    }

    private void deleteMenu() throws IOException, SQLException {
        SelectController sc = new SelectController();
        List<PatientVO> list = sc.selectAllPatient();
        System.out.println("번호\t진찰부서\t진찰비\t입원비\t진료비");
        System.out.println("--------------------------------------------------");
        list.forEach(p -> System.out.printf("%d\t%s\t%d\t%d\t%d%n",
                p.getNumber(), p.getDept(), p.getOperFee(), p.getHospitalFee(), p.getMoney()));
        System.out.println("삭제할 환자 번호 : ");
        int number = scan.nextInt();
        DeleteController dc = new DeleteController();
        if (dc.delete(number)) {
            JOptionPane.showMessageDialog(null,
                    number + "번 환자의 정보가 삭제되었습니다.");
        } else System.out.println("삭제 실패");

    }

    private void insertMenu() throws IOException {
        String i_o = null;
        do {
            System.out.println("환자 등록 메뉴");
            System.out.print("환자 번호 : ");
            int number = scan.nextInt();

            System.out.print("진료 코드 : ");
            String code = scan.next();

            System.out.print("입원 일수 : ");
            int days = scan.nextInt();

            System.out.print("환자 나이 : ");
            int age = scan.nextInt();

            PatientVO p = new PatientVO(number, code, days, age);
            InsertController ic = new InsertController();

            if (ic.insert(p)) {
                System.out.println("환자 등록 성공");
            } else {
                System.out.println("환자 등록 실패");
            }
            System.out.println("입력 / 출력 (I/O) ? :");
            i_o = this.scan.next();
        } while (i_o.equalsIgnoreCase("i"));
    }

    private int showMenu() {
        System.out.println("<< 새싹 정형외과 환자 관리 프로그램 >>");
        int choice = 0;
        System.out.println("1. 환자 등록");
        System.out.println("2. 환자 검색");
        System.out.println("3. 환자 목록");
        System.out.println("4. 환자 수정");
        System.out.println("5. 환자 삭제");
        System.out.println("0. 프로그램 종료");
        System.out.println("==========================");
        System.out.print("원하는 메뉴를 입력해주세요 : ");
        return this.scan.nextInt();
    }
}
