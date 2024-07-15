package java_0715;
import com.example.libs.Car;

public class ImportDemo1 extends Car {
    public static void main(String[] args) {
        Car sonata = new Car();
        System.out.println(sonata.name);

        ImportDemo1 id = new ImportDemo1();
        System.out.println(id.price);
    }
}
