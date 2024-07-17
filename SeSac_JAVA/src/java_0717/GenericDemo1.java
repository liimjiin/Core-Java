package java_0717;

public class GenericDemo1 {
    public static void main(String[] args) {
        // 기존 방법, price를 int로 선언해서 정수로만 받을 수 있음
//        Car carnival = new Car(40_000_000);
//        carnival1.setPrice(45_000_000);
//        System.out.println(carnival); // carnival.toString

        Car<Integer> morning = new Car<Integer>(45_000_000);
        System.out.printf("price = %d%n", morning.getPrice());
        Car<String> volvo = new Car<String>("천만원");
        System.out.printf("price = %s%n", volvo.getPrice());
    }
}

class Car<T> { //
    private T price;

    public Car(T price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                '}';
    }

    public T getPrice() {
        return price;
    }

    public void setPrice(T price) {
        this.price = price;
    }
}
