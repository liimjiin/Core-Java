package java_0718;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo7 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,7,1,2,9,3,5,8);
        List<String> sList = Arrays.asList("한강", "두만강", "낙동강", "압록강", "강산에");

        // 1.
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer front, Integer back) {
                return front - back; // Ascending Sort
            }
        });

        // 2. lambda
        Collections.sort(list, (front, back) -> front - back); // Ascending Sort
        Collections.sort(sList, (front, back) -> front.compareTo(back)); // Ascending Sort
        System.out.println(list);
        System.out.println(sList);
    }
}
