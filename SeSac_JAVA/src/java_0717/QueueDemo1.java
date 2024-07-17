package java_0717;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo1 {
    public static void main(String[] args) {
        String [] array = {"박지민","홍길동","사오정","루피", "코난","박지민","코난"};
        Queue<String> queue = new LinkedList<String>();
        for(String e : array){
            queue.add(e);
        }
        System.out.println(queue);
    }
}
