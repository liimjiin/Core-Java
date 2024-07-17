package java_0717;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {
    public static void main(String[] args) {
        String [] array = {"박지민","홍길동","사오정","루피", "코난","박지민","코난"};
        Set<String> hashSet = new HashSet<String>();
        Set<String> treeSet = new TreeSet<String>();
        for(String e : array){
            hashSet.add(e);
            treeSet.add(e);
        }
        System.out.println("hashSet : " + hashSet);
        System.out.println("treeSet : " + treeSet);



    }
}
