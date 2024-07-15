package java_0715;

public class AbstractDemo1 extends Normal1 {
    public AbstractDemo1(String name){
        super(name);
    }
    public static void main(String[] args) {
//        Normal normal = new Normal("지민~");
    Normal1 normal = new AbstractDemo1("쨔만");
        System.out.println(normal);
        }
    }

    abstract class Normal1{ // 실체가 없는 클래스,
    private String name;

        public Normal1(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Normal1{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
