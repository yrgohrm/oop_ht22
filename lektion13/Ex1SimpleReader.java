import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1SimpleReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("What is your name?");
        String name = reader.readLine();

        System.out.printf("Hello %s.%n", name);
    }
}
