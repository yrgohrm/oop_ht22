import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("What is your name?");
            String name = input.nextLine();
            System.out.printf("Hello %s%n", name);
        }
    }
}
