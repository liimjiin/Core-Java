package java_0717;

import java.awt.*;

public class EqualsDemo1 {
    public static void main(String[] args) {
        Point original = new Point(30, 100);
        Point target = new Point(30, 100);
        // Override하지 않은 original equals()는 객체의 주소를 비교
        System.out.println("original : " + original.equals(target));
    }
}

class point{
    private int x, y;
    public point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return String.format("(x,y) = (%d, %d)%n", this.x, this.y);
    }

//    @Override
//    public boolean equals(Object obj){
//        Point p = (Point) obj;
//        if(this.x == p.x && this.y == p.y) return true;
//        else return false;
//    }
}
