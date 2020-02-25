import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void fibonacci() {
        int n = 6;
        int expected = 8;
        int result = Fibonacci.fibonacci(n);
        assertEquals(expected,result);
    }
    @Test
    void showFibonacci() {
        int n = 5;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(0);
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        //int[] expected = {0, 1, 1, 2, 3};
        ArrayList<Integer> result = Fibonacci.showFibonacci(n);
       // Arrays.equals(arr,result);
        assertEquals(arr,result);
    }
}