package java_0716;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator cal;

    @BeforeEach
    void init(){
        this.cal = new Calculator();
    }

    @Test
    void add() {
        assertEquals(8, this.cal.add(3,5));
    }

    @Test
    void subtract() {
        assertEquals(5, this.cal.subtract(8,3));
    }

    @Test
    void divide() {
        assertEquals(2, this.cal.divide(4,2));
    }
}