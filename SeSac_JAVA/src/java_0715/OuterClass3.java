package java_0715;

public class OuterClass3 {
    public static void main(String[] args) {
        OuterClass3 oc3 = new OuterClass3();
        oc3.display();
    }
    void display(){
        int a = 5; // local variable
        class InnerClass4{
            int b = 100;
            static int c = 500;
            void print(){

            }
        }
        InnerClass4 ic = new InnerClass4();
        System.out.println(ic.b); // 멤버변수라서 가능
        System.out.println(InnerClass4.c); // static 이라서 가능
    }
}
