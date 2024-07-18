package java_0718;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo1 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(4,6,8,1,2);
        List<String> list2 = Arrays.asList("박지민", "홍지민", "한지민", "김지민");

        int[] array = {5,7,1,2,7,2,9,5};
        Arrays.sort(array);
        for (int num : array) {
            System.out.print(num);
        }
    }
}
