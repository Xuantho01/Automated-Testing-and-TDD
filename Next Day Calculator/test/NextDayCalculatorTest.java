import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void nextDay() {
        int day = 1;
        int month = 1;
        int year = 2020;

        String expected = "2/1/2020";
        String result = NextDayCalculator.NextDay(day,month,year);
        assertEquals(expected,result);
    }
}