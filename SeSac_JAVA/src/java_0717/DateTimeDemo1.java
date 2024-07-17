package java_0717;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateTimeDemo1 {
    public static void main(String[] args) {
        // 날짜 출력하는 방법 6가지
        // 1. Date
        Date now = new Date();
        System.out.println(now);

        // 2. Calendar
        Calendar cal = Calendar.getInstance(); // abstract class 라서 new 사용 불가, getInstance를 이용해 단일 캘린더를 불러옴
        System.out.printf("오늘은 %d년 %d월 %d일입니다.%n",
                cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1,
                cal.get(Calendar.DATE));
//                cal.get(Calendar.DAY_OF_MONTH)); // = Calender.DATE

        // 3. Calendar의 자식인 GregorianCalendar
        cal = new GregorianCalendar(2024, 10, 25);
        System.out.printf("금년은 %d년 %n", cal.get(Calendar.YEAR));// 세팅 가능

        // 4. DateFormat
        DateFormat df1 = DateFormat.getDateTimeInstance(
                DateFormat.FULL, DateFormat.MEDIUM, Locale.FRENCH
        );
        System.out.println(df1.format(new Date()));

        // 5. DateFormat의 자식 SimpleDateFormat
        String pattern = "오늘은 yyyy년 MM월 dd일입니다.";
        DateFormat df2 = new SimpleDateFormat(pattern);
        System.out.println(df2.format(new Date()));

        // 6. printf
//        String pattern2 = String.format("오늘은 %1$tY년 %1$tm월 %1$td일입니다.", new Date());
//        System.out.println(pattern2);
        System.out.printf("오늘은 %1$tY년 %1$tm월 %1$td일입니다.", new Date());

    }
}
