package java_0717;

import java.util.Date;
import java.util.Hashtable;
import java.util.StringTokenizer;

public class MapDemo1 {
    public static void main(String[] args) {
        Date now = new Date();
        String nowStr = now.toString(); // Wed Jul 17 15:37:08 KST 2024
        /* 문자열 Parsing 방법 3가지
            1. String class's split()
            2. Scanner class's useDelemeter() new Scanner(문자열).useDelemeter(String regex)
            3. java.uti.StringTokenizer class
         */
        StringTokenizer st = new StringTokenizer(nowStr);
        String [] array = new String[st.countTokens()];
        for (int i = 0; i < array.length; i++) {
            array[i] = st.nextToken();
        }
        System.out.println("오늘은 " + array[5] + "년 ");
        System.out.println(getMonthByName((array[1])) + "월 " + array[2] + "일입니다."); // 오늘은 2024년 Jul월 17일입니다.
    }

    static int getMonthByName(String month) {
        Hashtable<String, Integer> th = new Hashtable<String, Integer>();
        th.put("Jan",1); th.put("Feb",2);
        th.put("Mar",3); th.put("Apr",4);
        th.put("May",5); th.put("Jun",6);
        th.put("Jul",7); th.put("Aug",8);
        th.put("Sep",9); th.put("Oct",10);
        th.put("Nov",11); th.put("Dec",12);
        return th.get(month);
    }
}
