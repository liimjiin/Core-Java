package java_0716;

import java.util.Date;

public class DeprecationDemo1 {
    public static void main(String[] args) {
        Date today = new Date();
        int year = today.getYear();
        System.out.println(year + 1900);

    }
}
