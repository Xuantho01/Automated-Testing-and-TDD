public class Factorial {
    public static int FactorialCalculator(int NUM_TO_CALCULATOR_FACTORIAL) {
        boolean isInputNum_Equal0 = NUM_TO_CALCULATOR_FACTORIAL == 0;
        if(isInputNum_Equal0) {
            return 1;
        } else {
            return NUM_TO_CALCULATOR_FACTORIAL * FactorialCalculator(NUM_TO_CALCULATOR_FACTORIAL - 1);
        }

    }
    public static int showResult(int NumToCalculator){
        return FactorialCalculator(NumToCalculator);
    }
}
