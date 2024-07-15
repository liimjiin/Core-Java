package java_0715;

public class OuterClass2 {
    public static void main(String[] args) {
        OuterClass2.InnerClass2 ic = new OuterClass2.InnerClass2();
        ic.display();
        ic.print();

    }
    private int a = 5; // outer class's member variable
    private static int b = 10; // outer class's static variable

    private static class InnerClass2{ // static inner class
        private int c = 100; // static inner class's member variable
        private static int d = 500; // static inner class's static variable

        public void display(){ // static inner class's member method
            System.out.println(a + b + c + d); // 다 가능
        }

        public static void print(){
            System.out.println(b + d); // static inner class's static method
        }
    }
}
