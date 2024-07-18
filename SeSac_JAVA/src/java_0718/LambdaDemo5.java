package java_0718;

public class LambdaDemo5 {
        public static void main(String[] args) {
//            Person jm = new Person2();
            // 1. polymorphic parameter 이용
//           jm.greeting(new Say2() {
//                @Override
//                public int something(int a){
//
//                }
//            });

            // 2. Lambda Expression 이용
//            jm.greeting((a) -> {
//                System.out.println("I'm jm!");
//                System.out.println("I'm jk!");
//                return a * 100;
//            }
//        );
    }
}

@FunctionalInterface
interface Say2{
    int something(int a);
}

class Person2{
//    public void greeting (Say2 say){
//
//        int value = say.something(say)
//        say.something();
//    }
}

