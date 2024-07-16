package java_0716;

public class AnonymousDemo1 {
    // 상속을 통해 익명 객체 만들기
    public static void main(String[] args) {
//        Canine ca = new Dog();
//        ca.roam();
//        ca.bark();;
        Canine ca = new Canine() {
            @Override
            void bark() {
                System.out.println("으르렁 으르렁 으으렁");
            }
        };
        ca.bark();
    }
}

abstract class Canine{
    abstract void bark();
    void roam(){
        System.out.println("배회하다");
    }
}
class Dog extends Canine{
    void bark(){
        System.out.println("멍멍");
    }
}
