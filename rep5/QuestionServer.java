import java.io.*;
import java.net.*;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;

public class QuestionServer {

    // starta upp och lyssna på port 7788
    // ta emot en anslutning och skicka den till en egen tråd
    // i respektive tråd:
    // skicka en fråga
    // ta emot ett svar
    // kontrollera korrekthet
    // skicka tillbaka om det var rätt
    //
    // om användaren svarar "quit" avslutar vi direkt
    //
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                System.out.println("nu är det slut");
                executorService.shutdownNow();
                executorService.awaitTermination(2, TimeUnit.SECONDS);
            }
            catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
                ex.printStackTrace();
            }
        }));

        try (ServerSocket ssock = new ServerSocket(7788)) {
            Map<String, String> questions = readQuestions();

            while (true) {
                Socket client = ssock.accept();
                executorService.execute(new QuestionSender(client, questions));
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
            executorService.shutdown();
            executorService.awaitTermination(2, TimeUnit.SECONDS);
        }
    }

    private static Map<String, String> readQuestions() throws IOException {
        Map<String, String> questions = new HashMap<>();
        try (BufferedReader reader = Files.newBufferedReader(Path.of("questions.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] splitLine = line.split("#");
                if (splitLine.length != 2) {
                    throw new RuntimeException("unexpected input on line " + splitLine.length);
                }

                questions.put(splitLine[0], splitLine[1]);
            }
        }
        return Collections.unmodifiableMap(questions);
    }
}