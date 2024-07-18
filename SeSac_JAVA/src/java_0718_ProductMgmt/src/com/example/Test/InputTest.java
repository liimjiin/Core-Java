package java_0718_ProductMgmt.src.com.example.Test;
import java_0718_ProductMgmt.src.com.example.Input;
import java_0718_ProductMgmt.src.com.example.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InputTest {
    @Test
    void fileInput() {
        List<Product> list = new ArrayList<Product>();
        Input input = new Input(list);
        input.fileInput();
        assertNotNull(list); // null의 여부를 확인
        assertEquals("DISKETTE", list.get(5).getName()); // 5번째 제품의 이름을 확인

    }
}