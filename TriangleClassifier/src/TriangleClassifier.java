public class TriangleClassifier {
    public static String classifyTriangle(int EDGE_A, int EDGE_B, int EDGE_C){
        boolean isEquilateral = EDGE_A == EDGE_B && EDGE_B == EDGE_C;
        boolean isIsosceles = EDGE_A == EDGE_B
                || EDGE_B == EDGE_C
                || EDGE_A == EDGE_C;
        boolean isNotTriangle = EDGE_A <= 0
                || EDGE_B <= 0
                || EDGE_C <= 0
                || EDGE_A + EDGE_B <= EDGE_C
                || EDGE_B + EDGE_C <= EDGE_A
                || EDGE_A + EDGE_C <= EDGE_B;
        if(isEquilateral){
            return "isEquilateral";
        }else {

            if(isIsosceles){
                  return "isIsosceles";
            }else {

                if(isNotTriangle){
                    return "isNotTriangle";
                }
            }
        }
        return "isNormalTriangle";
    }
}
