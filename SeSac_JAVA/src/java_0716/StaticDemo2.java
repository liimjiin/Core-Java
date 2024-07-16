package java_0716;

public class StaticDemo2 {
    private int a;
    private static int b = print(); // 가장 먼저 메모리에 올라오기 때문에 print()가 가장 먼저 실행
    public static void main(String[] args) {
        System.out.println("main method");
    }

    void display(){ // member method

    }
    static int print(){ // static method
        System.out.println("static method"); // "main method" 보다 먼저 출력
        return 40_000_000;
    }
}
