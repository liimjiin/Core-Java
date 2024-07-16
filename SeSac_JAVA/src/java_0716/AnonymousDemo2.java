package java_0716;

public class AnonymousDemo2 {
    public static void main(String[] args) {
        Birds b = new Birds() {
            @Override
            public void fly() {
                System.out.println("훨훨");
            }

            @Override
            public void roam() {
                System.out.println("돌아다녀~~");
            }
        };
        b.fly();
        b.roam();
    }

}
interface Birds{
    void fly();
    void roam();
}
