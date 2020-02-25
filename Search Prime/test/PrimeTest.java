import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    @Test
    void searchPrime() {
        int n = 5;
        boolean expected = true;

        boolean result = Prime.searchPrime(n);
        assertEquals(expected,result);
    }

    @Test
    void showPerime() {
        int n = 5;
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(3);
        ArrayList<Integer> result = Prime.showPerime(n);
        assertEquals(expected,result);
    }
}