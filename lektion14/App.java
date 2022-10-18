import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class App {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Ange från och till");
            System.exit(-1);
        }

        Path input = Path.of(args[0]);
        Path output = Path.of(args[1]);

        try (InputStream is = new BufferedInputStream(Files.newInputStream(input));
                OutputStream os = new BufferedOutputStream(
                        Files.newOutputStream(output, StandardOpenOption.CREATE_NEW))) {

            is.transferTo(os);

        }
        catch (IOException ex) {
            System.out.println("Filen gick inte att kopiera: " + ex.getLocalizedMessage());
        }
    }
}
