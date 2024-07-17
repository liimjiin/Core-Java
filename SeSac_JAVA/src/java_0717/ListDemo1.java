package java_0717;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListDemo1 {
    public static void main(String[] args) {
        String [] array = {"박지민","홍길동","사오정","루피", "코난","박지민","코난"};
        Vector<String> vector = new Vector<String>(5,3); // 초기 사이즈, 증가 사이즈를 지정할 수 있다.

        /*
        List<String> list = new ArrayList<String>(5); // default : 방 10개 생성
        for (String e : array){
            list.add(e);
        }
        System.out.println("현재 방 개수 : "+list.size());
        System.out.println(list);

        list.remove(0);
        System.out.println(list);
        System.out.println(list.get(1));
         */

    }

}
