import java.util.ArrayList;

public class Fibonacci {

    public static ArrayList<Integer> fibonaccis = new ArrayList<Integer>();
    public static int fibonacci(int number){
        if(number == 0)
            return 0;
        if (number == 1 || number == 2)
            return 1;
        return fibonacci(number - 2) + fibonacci(number - 1);
    }
    public static ArrayList<Integer> showFibonacci(int maxOfLengthFibonacci){

        for (int i = 0; i < maxOfLengthFibonacci; i++){
            fibonaccis.add(fibonacci(i));
        }
        return fibonaccis;
    }
}

