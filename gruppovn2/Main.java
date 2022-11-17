import java.io.*;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String text = readAll(args);

        Censor censor = new Censor();
        System.out.println(censor.censor(text));
        System.out.println(censor.getWordCount());
    }

    private static String readAll(String[] args) throws IOException {
        StringBuilder allData = new StringBuilder();
        for (String arg : args) {
            Path file = Path.of(arg);
            if (Files.isRegularFile(file)) {
                allData.append(Files.readString(file));
            }
        }
        return allData.toString();
    }
}