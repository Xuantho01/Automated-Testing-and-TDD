public class FizzBuzz {
    public static String checkFizzBuzz(int numToCheck){
        String OutFizz = "Fizz";
        String OutBuzz = "Buzz";
        if (numToCheck == 3)
            return OutFizz;
        else if(numToCheck == 5)
            return OutBuzz;
        return "" + numToCheck;
    }
}
