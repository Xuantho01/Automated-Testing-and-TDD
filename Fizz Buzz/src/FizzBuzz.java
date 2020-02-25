public class FizzBuzz {
    public static final String OutFizz = "Fizz";
    public static final String OutBuzz = "Buzz";
    public static final String OutFizzBuzz = "FizzBuzz";
    public static String checkFizzBuzz(int numToCheck){
        boolean isFizz = numToCheck % 3 == 0;
        boolean isBuzz = numToCheck % 5 == 0;
        int get5Inlist = numToCheck / 10;
        int get3Inlist = numToCheck % 10;
        if (isFizz) {
            if(isBuzz){
                return OutFizzBuzz;
            }
            return OutFizz;
        }
        else if(isBuzz){
            return OutBuzz;
        }else {
            boolean has3Inlist = get5Inlist == 3 || get3Inlist == 3;
            if (has3Inlist){
                return OutFizz;
            }else if (get5Inlist == 5){
                return OutBuzz;
            }
        }
        return "" + numToCheck;
    }
}
