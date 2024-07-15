package java_0715;

public class InterfaceDemo3 {
    public static void main(String[] args) {
        Product pencil = new Product("연필");
        Product pen = pencil; // 주소 복사
        System.out.println(pen.name); // 연필
        Product pen2 = pencil.copy();
        System.out.println(pen2.name);
        pen.name = "짜잔";
        System.out.println("pen : " + pen.name);
        System.out.println("pen2 : " + pen2.name);
    }
}

class Product implements Cloneable { // flag interface
    String name;

    public Product(String name) {
        this.name = name;
    }

    public Product copy() {
        Product target = null;
        try {
            Object obj = this.clone();
            if (obj instanceof Product) {
                target = (Product) obj;
            }
        } catch (CloneNotSupportedException e) {
            System.out.println("복제 불가");
        }
        return target;
    }
}
