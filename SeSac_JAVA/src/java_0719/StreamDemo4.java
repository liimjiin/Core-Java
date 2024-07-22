package java_0719;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
        // filter(조건) : 중간연산, 조건에 맞는 것만 추출
        String[] array = {"바밤바", "누가바", "수박바", "메로나", "스크류바", "구구크런치"};
        Stream<String> sStream = Stream.of(array); // stream 생성
        sStream.filter(str -> str.length() >= 4).forEach(s -> System.out.println(s + "\t"));

        // map() : 중간연산
        List<Customer> list = new ArrayList<Customer>();
        Customer c1 = new Customer("박지민", 30); list.add(c1);
        Customer c2 = new Customer("김지민", 32); list.add(c2);
        Customer c3 = new Customer("한지민", 35); list.add(c3);
        Customer c4 = new Customer("최지민", 36); list.add(c4);
        Stream<Customer> customerList = list.stream(); // 생성
        // 객체에서 필요한 부분만 추출
        customerList.map(c -> c.getName()).forEach(s -> System.out.println(s));
        customerList.map(Customer::getName).forEach(System.out::println);

        // 중간연산 : filter(), map()
        // 최종연산 : count(), sum(), max(), average(), reduce(), forEach()

    }
}
class  Customer{
    private  String name;
    private int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
