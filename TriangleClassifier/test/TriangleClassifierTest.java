import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void classifyTriangle0() {
        int a = 2;
        int b = 2;
        int c = 2;

        String expected = "isEquilateral";

        String result = TriangleClassifier.classifyTriangle(a,b,c);

        assertEquals(expected,result);
    }

    @Test
    void classifyTriangle1() {
        int a = 2;
        int b = 2;
        int c = 3;

        String expected = "isIsosceles";

        String result = TriangleClassifier.classifyTriangle(a,b,c);

        assertEquals(expected,result);
    }
    @Test
    void classifyTriangle2() {
        int a = 2;
        int b = 3;
        int c = 4;

        String expected = "isNormalTriangle";

        String result = TriangleClassifier.classifyTriangle(a,b,c);

        assertEquals(expected,result);
    }
    @Test
    void classifyTriangle3() {
        int a = 8;
        int b = 2;
        int c = 3;

        String expected = "isNotTriangle";

        String result = TriangleClassifier.classifyTriangle(a,b,c);

        assertEquals(expected,result);
    }
    @Test
    void classifyTriangle4() {
        int a = 0;
        int b = 2;
        int c = 3;

        String expected = "isNotTriangle";

        String result = TriangleClassifier.classifyTriangle(a,b,c);

        assertEquals(expected,result);
    }
    @Test
    void classifyTriangle5() {
        int a = -1;
        int b = 2;
        int c = 3;

        String expected = "isNotTriangle";

        String result = TriangleClassifier.classifyTriangle(a,b,c);

        assertEquals(expected,result);
    }



}