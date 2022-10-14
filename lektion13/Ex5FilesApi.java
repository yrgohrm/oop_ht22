import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ex5FilesApi {
    public static void main(String[] args) throws IOException {
        Path theFile = Path.of("mydir", "apa.txt");
        if (!Files.exists(theFile)) {
            System.out.println("No such file exists!");
            System.exit(-1);
        }
        
        String line;
        try (BufferedReader reader = Files.newBufferedReader(theFile)) {
            while ((line = reader.readLine()) != null) {
                System.out.println(line.toLowerCase());
            }
        }
    }
}
