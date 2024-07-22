package java_0719;

import java.util.stream.IntStream;

public class StreamDemo3 {
    // reduce() : 스트림 요소를 하나씩 처리하면서 누적된 결과를 만들어내는 방식으로 동작, 모든 요소를 결합해 단일 결과 반환
    // return 타입이 int이기 때문에 최종연산
    public static void main(String[] args) {
        IntStream is = IntStream.range(1,101); // Stream 생성
        int total = is.reduce(0, (a, b) -> a + b);// reduce(초기값, 이항연산하는 메소드)
        System.out.println(total);
    }
}
