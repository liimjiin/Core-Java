package java_0718;

import java.util.Arrays;
import java.util.List;

public class LambdaDemo8 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("망고", "딸기", "수박", "물복", "망고스틴");
        // list에 저장된 각 element를 iterate해서 출력하기
        // 향상된 for문
        for(String str : list){
            System.out.println(str);
        }

        // forEach(Collections에서 사용) lambda
        list.forEach(str -> System.out.println(str + ", "));
    }
}
