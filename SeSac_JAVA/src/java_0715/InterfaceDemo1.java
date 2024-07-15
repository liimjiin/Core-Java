package java_0715;

public class InterfaceDemo1 {
    public static void main(String[] args) {
//        Mammal m = new Mammal(); // interface는 추상클래스와 같이 인스턴스를 만들 수 없음
        Mammal m1 = new Dog();
        Mammal m2 = new Cat();
        Mammal[] array1 = new Mammal[2]; // Mammal을 만든것이 아니라 Mammal(Mammal의 자식)이 들어올 공간만 만든 것
        Mammal[] array2 = {new Dog(), new Cat()};
        for(Mammal m : array2){
            m.display();
        }

    }
}
// interface를 구현시 implements를 사용
class Dog implements Mammal{

    @Override
    public void display() { // interface 추상메소드를 재정의 할 때는 반드시 public
        System.out.println("Dog : 멍멍");
    }
}

class Cat implements Mammal{

    @Override
    public void display() {
        System.out.println("Cat : 냐옹");
    }
}