import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Checked {
    public static void main(String[] args) throws IOException {
        // try {
            Files.copy(Path.of("Ex1.java"), Path.of("nisse.txt"), StandardCopyOption.REPLACE_EXISTING);
        // }
        // catch (IOException ex) {
        //     System.out.println("apa");
        // }
    }
}
