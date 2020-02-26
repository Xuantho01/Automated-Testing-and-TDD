import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void checkPalindrome() {
        String inChar = "abfgffghcb";

        boolean expected = true;

        boolean result = Palindrome.checkPalindrome(inChar);

        assertEquals(expected,result);
    }
}