package java_0719;

import java.util.Random;
import java.util.stream.IntStream;

public class StreamDemo2 {
    public static void main(String[] args) {
        // stream은 소진되면 runtime 오류가 발생한다.
        IntStream is = IntStream.rangeClosed(1,100); // stream 생성
        int sum = is.sum(); // 최종연산
//        long count = is.count(); // IllegalStateException 오류 발생,
        /* 이미 최종연산된(사용된) stream을 다시 최종연산 하는 경우
            한번 사용한 Stream은 재사용할 수 없는 일회성 객체
            필요한 경우 다시 생성해야함
         */

        // 1 ~ 100 사이에 난수를 발생, 중복을 제외하고, 5개 추출, sorting
        // 중간연산, return이 stream으로 되는 경우 chain 형태로 이어갈 수 있음
        IntStream sortedInt = new Random().ints(1,100).distinct().limit(5).sorted();
        // 소진
        sortedInt.forEach(i -> System.out.println(i + "\t"));
    }
}
