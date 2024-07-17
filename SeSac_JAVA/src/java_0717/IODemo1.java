package java_0717;

import java.io.IOException;
import java.io.InputStream;

public class IODemo1 {
    public static void main(String[] args) throws IOException {
        System.out.println("글자 하나를 입력하세요");
        InputStream is = System.in;
        int code = 0;
        int num = is.read();
        code = is.read();
        System.out.println("code = " + code);
    }
}
