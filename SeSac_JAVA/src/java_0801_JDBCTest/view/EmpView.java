package java_0801_JDBCTest.view;

import java_0801_JDBCTest.controller.InsertController;
import java_0801_JDBCTest.controller.SelectController;
import java_0801_JDBCTest.model.EmpVO;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Author : Jinhee Lim(insertMenu()), Hyerin Lim(EmpView(), showMenu(), selectAllMenu())
 * When : Aug, 01, 2024
 * Objective : 사원 데이터를 입력하고 출력합니다.
 * Environment : Windows 10 22H2(OS build 19045.4651), openjdk 17.0.11, IntelliJ 2024.1.4
 */

public class EmpView {
    private Scanner scan;

    public EmpView() throws IOException {
        this.scan = new Scanner(System.in);
        boolean isContinue = true;
        while (isContinue) {
            switch (showMenu()) {

                // 1. 사원 정보 입력
                case 1:
                    try {
                        insertMenu();
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    break;

                // 2. 사원 목룍 출력
                case 2:
                    selectAllMenu();
                    break;

                // 9. 종료하기
                case 9:
                    isContinue = false;
                    JOptionPane.showMessageDialog(null, "Program is over...");
                    break;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.");
            }
        }
        JOptionPane.showMessageDialog(null, "Program is over...");
    }

    //  사원 관리 프로그램 메뉴를 띄웁니다.
    private int showMenu() {
        System.out.println("┌ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ┐");
        System.out.println("│         사원관리 프로그램                │");
        System.out.println("└ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ┘");

        System.out.println("┌ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ┐");
        System.out.println("│ 1. 데이타 입력                          │");
        System.out.println("│ 2. 데이타 출력                          │");
        System.out.println("│ 9. 종료                                │");
        System.out.println("└ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ┘");
        System.out.print("원하시는 메뉴 번호를 선택해주세요 : ");
        return scan.nextInt();
    }

    // 1. 사원 정보를 입력합니다.
    private void insertMenu() throws IOException {
        int sal = 0;
        int n_time = 0;
        int fam = 0;
        String i_o = null;
        do {
            System.out.println("데이터 입력 메뉴");
            System.out.print("사원 번호 : ");
            String empno = this.scan.next();

            System.out.print("사원 이름 : ");
            String ename = this.scan.next();

            do {
                System.out.print("기본급 ( 1 ~ 4 ) : ");
                sal = this.scan.nextInt();
                if (sal > 4 || sal < 1) {
                    System.out.println("잘못 입력 하셨습니다. 다시 입력해주세요.");
                }
            } while (sal > 4 || sal < 1);

            do {
                System.out.print("야간시간 ( 1 ~ 4 ) : ");
                n_time = this.scan.nextInt();
                if (n_time > 4 || n_time < 1) {
                    System.out.print("잘못 입력 하셨습니다. 다시 입력해주세요.");
                }
            } while (n_time > 4 || n_time < 1);

            do {
                System.out.print("가족 수 ( 1 ~ 5 ) : ");
                fam = this.scan.nextInt();
                if (fam > 5 || fam < 1) {
                    System.out.println("잘못 입력 하셨습니다. 다시 입력해주세요.");
                }
            } while (fam > 5 || fam < 1);

            EmpVO emp = new EmpVO(empno, ename, sal, n_time, fam);
            InsertController ic = new InsertController();

            if (ic.insert(emp)) {
                System.out.println("데이터 등록 성공");
            } else {
                System.out.println("데이터 등록 실패");
                break;
            }
            System.out.print("입력 / 출력(I/O) ? :");

            i_o = this.scan.next();

        } while (i_o.equalsIgnoreCase("I"));
    }


    // 2. 사원 목록을 출력합니다.
    private void selectAllMenu() throws IOException {
        SelectController sc = new SelectController();
        List<EmpVO> list = sc.selectAllEmp();
        System.out.println("사원번호\t사원이름\t부서명\t기본급\t호급수당\t가족수당\t야간수당\t총금액\t실수령액");
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        if(list == null || list.size() == 0) System.out.println("등록된 데이터가 없습니다.");
        else if(list.size() > 0) {
            list.forEach(emp -> System.out.printf("%s\t%s\t%s\t%d\t%d\t%d\t%d\t%d\t%d%n",
                    emp.getEmpno(), emp.getEname(), emp.getDname(), emp.getSal(), emp.getHo_sal(), emp.getFam_sal(),
                    emp.getN_sal(), emp.getTotal(), emp.getNet_amount()));
        }
    }
}