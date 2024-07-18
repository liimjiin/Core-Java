package java_0718_ProductMgmt.src.com.example.Test;

import java_0718_ProductMgmt.src.com.example.Calc;
import java_0718_ProductMgmt.src.com.example.Input;
import java_0718_ProductMgmt.src.com.example.Product;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalcTest {

    @Test
    void calc() {
        List<Product> list = new ArrayList<Product>();
        Input input = new Input(list);
        input.fileInput();

        Calc calc = new Calc(list);
        calc.calc();

        assertEquals(7_597_000, list.get(1).getBenefit());
    }
}