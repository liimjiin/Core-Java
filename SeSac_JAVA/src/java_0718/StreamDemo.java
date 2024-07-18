package java_0718;

import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
[Stream API]
1. Stream : 배열이나 Collection과 같이 여러 개의 데이터를 일괄 처리하기 위한 문법
2. Data를 Stream으로 처리하기 위해서는 먼저 Stream 객체 생성이 필요
3. 연산 결과가 Stream으로 return되면 중간 연산
4. 연산 결과가 Stream이 아닌 경우 최종 연산
5. 중간 연산 결과가 Stream으로 리턴되기 때문에 Stream 연산을 계속 이어서 chain 형태로 이용 가능
6. 최종 연산의 결과는 Stream이 아니기 때문에 다른 Stream 연산 수행 불가
7. Stream 연산은 원본의 데이터를 읽어 기능을 수행, 내용 변경은 불가

[Stream API 종류]
1. Stream 생성
2. 생성된 Stream을 가공하는 중간 연산
3. 최종 결과를 만드는 최종 연산
 */
public class StreamDemo {
    public static void main(String[] args) {
        // Stream 생성 : 배열과 Collection에 따라 생성 방법이 다름

        // 배열로부터 Stream 생성
        Integer [] intArray = {1,2,3,4,5};
        Stream<Integer> s1 = Stream.of(intArray);

        String [] strArray = {"사과", "배", "딸기", "물복", "망고스틴"};
        Stream<String> s2 = Stream.of(strArray);

        // Arrays로부터 Stream 생성
        Stream<Integer> s3 = Arrays.stream(intArray);
        Stream<String> s4 = Arrays.stream(strArray);

        // Collection으로부터 Stream 생성
        List<String> list = Arrays.asList("사과", "배", "딸기", "물복", "망고스틴");
        Stream<String> s5 = list.stream();

        List<Integer> list1 = Arrays.asList(3,4,7,1,2,3);
        Stream<Integer> s6 = list1.stream();

        Set<String> set = new HashSet<String>(Arrays.asList("사과", "배", "딸기", "물복", "망고스틴"));
        Stream<String> s7 = set.stream();

        // 지정된 범위를 이용해서 만드는 Stream
        IntStream is = IntStream.range(1, 11); // 1 ~ 10
        DoubleStream ds = DoubleStream.of(10.5);

        // 난수를 발생하여 Stream 생성하기
        // 1.0 ~ 10.0 중 난수 15개
        DoubleStream ds1 = new Random().doubles(15L, 1.0, 10.0);
        IntStream is1 = new Random().ints(5, 1, 10); // 1부터 10까지 난수 5개


    }

}
