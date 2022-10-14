import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ex3TryWithResources {
    public static void main(String[] args) throws IOException {
        Path file = Path.of("xx.txt");

        if (Files.size(file) > 100L * 1024 * 1024) {
            System.out.println("Nänä!");
            return;
        }

        try (BufferedReader reader = Files.newBufferedReader(file)) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
