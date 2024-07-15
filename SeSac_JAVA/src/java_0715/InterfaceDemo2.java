package java_0715;

public class InterfaceDemo2 {
    public static void main(String[] args) {
        Car sonata = new Car("소나타", 30_000_000);
        Car matiz = new Car("RedMatiz", 10_000_000);
        // sonata - matiz
        int result = sonata.compareTo(matiz);
        System.out.println(result);

    }
}

class Car implements Comparable<Car>{
    private String name;
    private int price;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    // 내가 car, 비교하는 값이 other
    public int compareTo(Car other) { // 재정의 해야하는 메소드
        return this.price - other.price;
    }
}
