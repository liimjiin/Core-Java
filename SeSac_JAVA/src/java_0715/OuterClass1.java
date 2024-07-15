package java_0715;

public class OuterClass1 {
    public static void main(String[] args) {
        OuterClass1 oc = new OuterClass1();
        OuterClass1.InnerClass ic = oc.new InnerClass(); // oc.new : 바깥 class의 주소가 필요
        System.out.println(ic.c);
        System.out.println(InnerClass.d);
    }
    private int a = 5; // outer class's member variable
    private static int b = 10; // outer class's static variable

    private class InnerClass{ // member inner class
        private int c = 100; // inner class's member variable
        private static int d = 500; // inner class's static variable

        public void display(){ // inner class's member method
            System.out.println(a + b + c + d); // 다 가능

        }

        public static void print(){
            System.out.println(b + d); // inner class's static method
        }
    }
}
