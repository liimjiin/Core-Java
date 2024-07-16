package java_0716;

public class StaticDemo3 {
    private int a; // member variable : 객체를 생성새야 만들어짐
    private final int B; // member constant
    private static int c; // static variable
    private static final int D; // static constant
    {
        // Initialization block : 멤버변수, 멤버상수 초기화, 객체 생성할 때마다 자동 호출
        a = 5;
        B = 100;
    }

    static { // static initialization block : class 로딩될 때 단 한번 수행
        c = 500;
        D = 100;
    }

    public static void main(String[] args) {
        System.out.println("c : " + c + "d : " + D);

    }

    void print(){
        int e; // local variable
        final int F; // local constant
    }
}
