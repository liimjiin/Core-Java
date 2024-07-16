package java_0716;

public class AnonymousDemo3 {
    public static void main(String[] args) {
        AnonymousDemo3 ad = new AnonymousDemo3();
        Dog1 dog = new Dog1();
        ad.display(dog);
        ad.display(new Mammal() {
            @Override
            public void sound() {

            }
        });
    }
    void display(Mammal m){
        m.sound();
    }

}
interface Mammal{
    void sound();
}
class Dog1 implements Mammal{

    @Override
    public void sound() {
        System.out.println("w");
    }
}