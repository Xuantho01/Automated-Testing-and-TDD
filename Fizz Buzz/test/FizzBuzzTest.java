import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void checkFizzBuzz() {
        int n = 3;
        String expected = "Fizz";

        String result = FizzBuzz.checkFizzBuzz(n);
        assertEquals(expected,result);
    }
}