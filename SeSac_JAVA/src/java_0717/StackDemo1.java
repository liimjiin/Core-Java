package java_0717;

import java.util.Stack;

public class StackDemo1 {
    public static void main(String[] args) {
        String [] array = {"박지민","홍길동","사오정","루피", "코난","박지민","코난"};
        Stack<String> stack = new Stack<String>();
        for(String e : array){
            stack.push(e);
        }
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        while (!stack.empty()){
            System.out.println(stack.pop());
        }

    }
}
