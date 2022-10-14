import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ex4DoubleTryWithResources {
    public static void main(String[] args) throws IOException {
        try (BufferedReader f1 = Files.newBufferedReader(Path.of("xx.txt"));
                BufferedReader f2 = Files.newBufferedReader(Path.of("yy.txt"))) {
            String line1, line2;
            while (true) {
                line1 = f1.readLine();
                line2 = f2.readLine();
                if (line1 == null && line2 == null) {
                    // both files end at the same time
                    break;
                }
                else if (line1 == null || line2 == null || !line1.equals(line2)) {
                    System.out.println("Not a match");
                    break;
                }
            }
        }
    }
}
