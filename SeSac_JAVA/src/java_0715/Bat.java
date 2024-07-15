package java_0715;

public class Bat extends Mammal2 implements Birds{
    @Override
    public void fly() {
        System.out.println("날다");
    }

    @Override
    public void giveBirth() {
        System.out.println("낳다");
    }

    public static void main(String[] args) {
        Bat b = new Bat();
        b.fly();
        b.giveBirth();
    }
    
}
