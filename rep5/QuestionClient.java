import java.io.*;
import java.net.*;
import java.util.*;

public class QuestionClient {
    // anslut till servern, port 7788
    // ta emot en fråga
    // läsa in ett svar från användaren
    // skicka svaret till servern
    // ta emot om det var rätt eller fel
    // visa det för användaren
    public static void main(String[] args) throws UnknownHostException, IOException {
        try (Scanner scanner = new Scanner(System.in);
                Socket socket = new Socket("localhost", 7788);
                BufferedReader input =
                        new BufferedReader(new InputStreamReader(socket.getInputStream()));
                BufferedWriter output =
                        new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))) {

            while (question(input)) {
                answer(scanner, output);
                printCorrectness(input);
            }
        }
    }

    private static boolean question(BufferedReader input) throws IOException {
        String q = input.readLine();
        if (q == null) {
            return false;
        }
        System.out.println(q);
        return true;
    }

    private static void printCorrectness(BufferedReader input) throws IOException {
        String isCorrectString = input.readLine();
        boolean isCorrect = Boolean.parseBoolean(isCorrectString);

        if (isCorrect) {
            System.out.println("Du hade rätt");
        }
        else {
            System.out.println("Du hade fel...");
        }
    }

    private static void answer(Scanner scanner, BufferedWriter output) throws IOException {
        String answer = scanner.nextLine();
        output.write(answer);
        output.write("\n");
        output.flush();
    }
}
