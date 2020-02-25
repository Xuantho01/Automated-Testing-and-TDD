public class FizzBuzz {
    public static final String OutFizz = "Fizz";
    public static final String OutBuzz = "Buzz";
    public static final String OutFizzBuzz = "FizzBuzz";
    public static String checkFizzBuzz(int numToCheck){
        boolean isFizz = numToCheck % 3 == 0;
        boolean isBuzz = numToCheck % 5 == 0;
        int numberInList = numToCheck/10;
        if (isFizz) {
            if(isBuzz){
                return OutFizzBuzz;
            }
            return OutFizz;
        }
        else if(isBuzz){
            return OutBuzz;
        }else if (numberInList == 3){
            return OutFizz;
        }else if (numberInList == 5){
            return OutBuzz;
        }
        return "" + numToCheck;
    }
//    public static String checkListNumber(int inputNumber){
//        int numberInList = inputNumber/10;
//        if (numberInList == 3){
//            return OutFizz;
//        }else if(numberInList == 5)
//            return OutBuzz;
//        return ""+inputNumber;
////    }
//    public static void main(String[] args) {
//        checkFizzBuzz(31);
//    }
}
