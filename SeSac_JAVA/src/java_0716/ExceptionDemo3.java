package java_0716;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        a();
    }
    static void a(){
        b();
    }
    static void b(){
        try {
            c();

        }catch (ArithmeticException e){
        System.out.println("잡았다");
        }
    }
    static void c(){
        d();
    }
    static void d(){
        System.out.println(5/0);
    }


}
