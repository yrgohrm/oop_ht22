import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Exercise1 {
    public static void main(String[] args) throws IOException {
        Path file = Path.of("hello.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(file, StandardOpenOption.APPEND)) {
            writer.write("Hello, world!");
            writer.newLine();
        }
    }
}
