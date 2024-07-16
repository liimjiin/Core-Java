package java_0716;

public class WrapperDemo {
    public static void main(String[] args) {
//        int su = 5; // statck에 위치
//        Integer in = new Integer(su); //Wrapping, Boxing  heap에 있는 5
//        int another = Integer.
        int su = 5;
        Integer in = su * 10; // Autoboxing
        int another = in;
        System.out.println("su : " + su); // Autoboxing
        System.out.println("another : " + another);



    }
}
