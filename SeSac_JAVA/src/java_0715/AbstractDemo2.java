package java_0715;

public class AbstractDemo2 extends Normal2 {
        public AbstractDemo2(String name){
            super(name);
        }

        @Override
        public void display() {
            System.out.print(super.getName());
        }

        public static void main(String[] args) {
            Normal2 normal = new AbstractDemo2("쨔만");

        }
    }

    abstract class Normal2 { // 실체가 없는 클래스,
        private String name;

        public Normal2(String name) {
            this.name = name;
        }

        public abstract void display();

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Normal{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
