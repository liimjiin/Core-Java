package java_0716;

import java.util.Scanner;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        Car matiz = new Car();
        matiz.name = "대우 마티즈";
        System.out.println(matiz.name);
        matiz = null;
        try {
            System.out.println(matiz.name);
        }catch (NullPointerException e){
           // System.out.println(e.getMessage); // -> error msg
           // System.out.println(e); // e.toString() -> error msg + Exception Type
            //e.printStackTrace(); // -> 모두 표기
        }
    }

}