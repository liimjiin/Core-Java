package java_0717;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class GenericDemo2 {
    public static void main(String[] args) {
        Object obj = "Hello";
        Vector<Object> v1 = new Vector<>();
        Vector v2 = new Vector();
        Vector<String> v3 = new Vector<String>();
//      v3.add(5); // 오류
        v3.add("5");
        Product<Integer> note = new Product<Integer>(1000);
        Product<Double> pen = new Product<Double>(100.0);
//      Product<Object> obj = new Product<Object>(new Object()); // Number 보다 상위 class인 Object는 못함
        Car <?> car = new Car <Integer>(1000);
        Car<? extends Number> car1 = new Car<Double>(1.0); // <? extends Number> : Number 이하만 가능
        Car<? super Number> car2 = new Car<Object>("천만원"); // <? super Number> : Number 이상만 가능
        // super인 경우에는 실체형을 따라가고, extends의 경우에는 선언형을 따라간다.
        // ?는 Object형을 따라간다.
    }
}

class Product<T extends Number>{ // Number의 자식만 들어올 수 있도록
    private T price;
    public Product(T price){
        this.price = price;
    }

    @Override
    public String toString(){
        return String.valueOf(price);
    }

    List<Car> list = new ArrayList<Car>();
}
