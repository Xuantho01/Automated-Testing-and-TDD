import java.util.Arrays;

public class Palindrome {
    public static boolean checkPalindrome(String inputStringToCheck){

        char[] stringToCheck = inputStringToCheck.toCharArray();
        int count = 1;
        for (int i = 0; i < stringToCheck.length/2; i++){
             if(stringToCheck[i] != stringToCheck[stringToCheck.length - 1 - i])
                 count = 0;
             else count = 1;
        }
        if (count == 0) return true;
        return false;
    }
}
