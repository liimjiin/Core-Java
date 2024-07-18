package java_0718;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StreamDemo1 {
    public static void main(String[] args) {
        DoubleStream ds = new Random().doubles(10L, 1.0, 10.0);
        ds.forEach(d -> System.out.println(d + ", "));

        System.out.println("=====================================");
        int result = IntStream.rangeClosed(1, 10).sum();
        System.out.println(result);
    }
}
