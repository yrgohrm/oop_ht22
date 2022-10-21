import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        // öppna filen
        // läsa in filen
        // göra den till vettiga ord
        // ta bort för korta ord
        // se till att den inte har dubbletter
        // skriva till en  ny fil

        if (args.length != 1) {
            printHelp();
            System.exit(-1);
        }

        Path inFile = Path.of(args[0]);
        Path outFile = Path.of(args[0] + ".clean.txt");

        if (!Files.isReadable(inFile)) {
            printHelp();
            System.exit(-1);
        }

        try (BufferedReader reader = Files.newBufferedReader(inFile);
             BufferedWriter writer = Files.newBufferedWriter(outFile)) {

            Set<String> words = readWords(reader);
            
            for (String word : words) {
                writer.write(word);
                writer.newLine();
            }

        }
        catch (IOException ex) {
            // TODO: move exit into help and refactor
            System.err.println("Error while reading file.");
            System.exit(-1);
        }

    }

    private static Set<String> readWords(BufferedReader reader) throws IOException {
        Set<String> words = new HashSet<>();

        String line;
        while ((line = reader.readLine()) != null) {
            Set<String> lineWords = splitIntoWords(line);
            words.addAll(lineWords);
        }

        return words;
    }

    private static Set<String> splitIntoWords(String line) {
        Set<String> words = new HashSet<>();

        String[] rawWords = line.split("\\s");
        for (String word : rawWords) {
            String cleanWord = cleanWord(word);
            if (cleanWord.length() == 0 || Character.isUpperCase(cleanWord.charAt(0))) {
                continue;
            }

            // TODO: check if we need this!
            String lcWord = cleanWord.toLowerCase();
            if (lcWord.length() > 5) {
                words.add(lcWord);
            }
        }

        return words;
    }

    private static String cleanWord(String word) {
        StringBuilder sb = new StringBuilder();

        for (char ch : word.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    private static void printHelp() {
        System.out.println("Usage: java App <filename>");
    }
}