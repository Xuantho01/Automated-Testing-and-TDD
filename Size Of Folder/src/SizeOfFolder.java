import java.io.File;
import java.util.Arrays;
import java.util.Objects;

public class SizeOfFolder {
    public static void main(String[] args) {
              File file = new File("");
              if (file.exists()){
                  double bytes = file.length();
                  System.out.println(bytes);
        }
    }
}

