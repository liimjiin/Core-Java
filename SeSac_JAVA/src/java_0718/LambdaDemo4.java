package java_0718;

public class LambdaDemo4 {
    public static void main(String[] args) {
        Person jm = new Person();
        // 1. polymorphic parameter 이용
//       jm.greeting(new Say1() {
//            @Override
//            public void something() {
//                System.out.println("I'm jm!");
//                System.out.println("I'm jk!");
//                return 100;
//            }
//        });

        // 2. Lambda Expression 이용
//        jm.greeting(() -> {
//                System.out.println("I'm jm!");
//                System.out.println("I'm jk!");
//                return 100;
//            }
//        });
//    }
    }

    @FunctionalInterface
    interface Say1 {
        void something();
    }

    class Person1 {
        public void greeting(Say say) {
            say.something();
        }
    }
}