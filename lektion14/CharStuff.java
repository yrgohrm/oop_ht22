import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class CharStuff {
    public static void main(String[] args) throws IOException {
        try (BufferedWriter w = Files.newBufferedWriter(Path.of("test.txt"))) {
            w.write("❤️");
        }

        try (InputStream is = Files.newInputStream(Path.of("test.txt"))) {
            byte[] data = new byte[100];
            int bytesRead = is.read(data);
            System.out.println("Bytes read: " + bytesRead);
        }
    }
}
