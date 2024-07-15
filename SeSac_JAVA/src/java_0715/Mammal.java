package java_0715;

public interface Mammal {
    // interface가 가질 수 있는 두가지
    // 1. public static final이 생략된 상수
    double PI = 3.14;
    int mon = 0;
    int sat = 0;

    // 2. public abstract 생락된 추상 메소드
    void display();

    //private String name; // interface는 변수를 가질 수 없음
//    private int age;
//    public Mammal(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "Mammal{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
}
