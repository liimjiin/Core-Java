package java_0718;

public class LambdaDemo6 {
        public static void main(String[] args) {
//            Person jm = new Person2();
            // 1. polymorphic parameter 이용
//           jm.greeting(new Say3() {
//                           @Override
//                           public int something(int a, int b) {
//                               System.out.println("낭ㄹ");
//                               System.out.println("낭ㄹ");
//                               return a * b;
//                           }
//                       });

            // 2. Lambda Expression 이용
//            jm.greeting((a,b) -> {
//                System.out.println("I'm jm!");
//                System.out.println("I'm jk!");
//                return a * b;
//            }
//        );
    }
}

@FunctionalInterface
interface Say3{
    int something(int a, int b);
}

class Person3{
    public void greeting (Say3 say){
        int value = say.something(5, 10);
        System.out.println(value);
    }
}

