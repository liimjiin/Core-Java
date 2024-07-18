package java_0718;

public class LambdaDemo3 {
    public static void main(String[] args) {
        Person jm = new Person();
        // 1. polymorphic parameter 이용
/*        jm.greeting(new Say() {
            @Override
            public void something() {
                System.out.println("I'm jm!");
                System.out.println("I'm jk!");
            }
        });
 */
        // 2. Lambda Expression 이용
        jm.greeting(() -> {
                System.out.println("I'm jm!");
                System.out.println("I'm jk!");
            }
        );
    }
}

@FunctionalInterface
interface Say{
    void something();
}

class Person{
    public void greeting (Say say){
        say.something();
    }
}
