import java.util.ArrayList;
public class Prime {
    public static final int FIRST_OF_PRIME = 2;
    public static ArrayList<Integer> ListOfPrime = new ArrayList<>();
    public static boolean searchPrime(int inputNumber){
        if (inputNumber < FIRST_OF_PRIME)
              return false;
        int squareRoot = (int)Math.sqrt(inputNumber);
        for (int i = 2; i <= squareRoot; i++){
            boolean isEvenNumber = inputNumber % i == 0;
            if(isEvenNumber){
                return false;
            }
        }
        return true;
    }
    public static ArrayList<Integer> showPerime(int LengthOfPrime){

        for (int i = 0; i < LengthOfPrime; i++ ){
            if(searchPrime(i))
              ListOfPrime.add(i);
        }
        return ListOfPrime;
    }
}
