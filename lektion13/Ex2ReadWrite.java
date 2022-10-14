import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ex2ReadWrite {
    public static void main(String[] args) throws IOException {
        BufferedReader r = Files.newBufferedReader(Path.of("xx.txt"));
        BufferedWriter w = Files.newBufferedWriter(Path.of("yy.txt"));

        r.transferTo(w);
        w.flush();
    }
}
