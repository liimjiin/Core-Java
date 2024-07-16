package java_0716;

public class FinalDemo1 {
    public static void main(String[] args) {
        parent p = new child();
        p.display();
    }
}

class parent{
    public final void display(){
        System.out.println("부모");
    }
}

class child extends parent{
//    public void display(){ // 상속 불가
//        System.out.println("자식");
//    }
}
