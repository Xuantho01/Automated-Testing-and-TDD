import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    @DisplayName("Fizz")
    void checkFizz() {
        int n = 3;
        String expected = "Fizz";

        String result = FizzBuzz.checkFizzBuzz(n);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Buzz")
    void checkBuzz() {
        int n = 5;
        String expected = "Buzz";

        String result = FizzBuzz.checkFizzBuzz(n);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("FizzBuzz")
    void checkFizzBuzz() {

        int n = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzz.checkFizzBuzz(n);
        assertEquals(expected,result);

    }

    @Test
    @DisplayName("Fizzll")
    void exceedFizzBuzz() {

        int n = 31;
        String expected = "Fizz";
        String result = FizzBuzz.checkFizzBuzz(n);
        assertEquals(expected,result);

    }
    @Test
    @DisplayName("Fizzll with 3")
    void exceedFizzBuzz3() {

        int n = 13;
        String expected = "Fizz";
        String result = FizzBuzz.checkFizzBuzz(n);
        assertEquals(expected,result);

    }
}