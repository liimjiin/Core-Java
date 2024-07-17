package java_0717;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo2 {
    public static void main(String[] args) throws IOException {
        Properties info = new Properties();
        info.load(new FileInputStream(new File("D:\\Workspace\\SeSac_JAVA\\src\\java_0717\\productinfo.properties")));
        System.out.println("나이 = " + info.getProperty("age"));
        System.out.println("거주지 = " + info.getProperty("city"));
        System.out.println("이름 = " + info.getProperty("name"));
    }
}
