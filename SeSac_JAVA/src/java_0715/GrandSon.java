package java_0715;

public class GrandSon implements Son {
    public static void main(String[] args) {
        Grand jm = new GrandSon();
        jm.grandFather();

        Father jk = new GrandSon();
        jk.grandFather();
        jk.father();

        Mother js = new GrandSon();
        js.mother();

        Son ys = new GrandSon();
        ys.mother();
        ys.father();
        ys.grandFather();

        Son [] array = new Son[3];
        array[0] = new GrandSon();

        // public 'static' final로 선언되었기 때문에 접근 가능
        System.out.println(Father.NAME +", "+ Mother.NAME);

    }

    @Override
    public void son() {
        System.out.println("son");
    }

    @Override
    public void father() {
        System.out.println("father");
    }

    @Override
    public void grandFather() {
        System.out.println("grandFather");
    }

    @Override
    public void mother() {
        System.out.println("mother");
    }
}
