package java_0717;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo1 {
    public static void main(String[] args) {
        // System : Os에게 메세지를 전달하는 통로
        Properties infos = System.getProperties();
        Enumeration<Object> enums = infos.keys();
        while (enums.hasMoreElements()) {
            String key = (String) enums.nextElement();
            System.out.println(key + " => " + System.getProperty(key));
        }
    }

}
