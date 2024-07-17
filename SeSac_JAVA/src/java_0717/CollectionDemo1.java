package java_0717;

import java.util.*;

public class CollectionDemo1 {
    public static void main(String[] args) {
        String [] array = {"박지민","홍길동","사오정","루피", "코난","박지민","코난"};
        /*
        Set<String> set = new HashSet<String>();
        for(String e : array){
            set.add(e);
        }
        // bulk로 데이터를 추출하고자 할 때, Enumeration, Iterator
        Iterator<String> iter = set.iterator();
        while (iter.hasNext()){ // 다음 element가 있다면 '참'
            System.out.print(iter.next()+", ");
         */

        Vector<String> vector = new Vector<String>();
        for(String e : array){
            vector.add(e);
        }
        Enumeration<String> enums = vector.elements();
        while (enums.hasMoreElements()){
            System.out.print(enums.nextElement() + ", ");
        }
    }
}
