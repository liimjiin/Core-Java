package java_0716;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        Car carnival = new Car();
        carnival.name = "카니발";
        System.out.println(carnival.name);
        carnival = null;

        if(carnival != null){
        System.out.println(carnival.name); // NullPointerException
        }else{
            System.out.println("null");
        }

        String money1 = "30_000_000원";
        int intMoney = Integer.parseInt(money1); // umberFormatException

        Scanner sc = new Scanner(System.in);
        System.out.println("Money (숫자만 입력해라): ");
        int money2 = sc.nextInt();
        System.out.println(money2); // String 입력한 경우, InputMismatchException
    }
}

class Car{
    public String name;
}
