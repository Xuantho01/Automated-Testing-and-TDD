import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void factorialCalculator() {
        int n = 3;
        int expected = 6;

        int result = Factorial.FactorialCalculator(n);
        assertEquals(expected,result);
    }

    @Test
    void showResult() {
        int n = 4;
        int expected = 24;
        int result = Factorial.showResult(n);
        assertEquals(expected,result);
    }
}