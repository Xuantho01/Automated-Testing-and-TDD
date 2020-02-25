import java.util.Date;

public class NextDayCalculator {
    public static String NextDay(int day, int month, int year){
        day += 1;
        return (day) + "/" + month + "/" + year;
    }
}
