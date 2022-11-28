import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;

public class L23Ovn5 {
    public static void main(String[] args) throws IOException {
        String text = "\u2661\u2665\u2661";

        try (BufferedWriter w = Files.newBufferedWriter(Path.of("ut.txt"))) {
            w.write(text);
        }
    }
}
