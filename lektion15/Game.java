import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            GuessingGame game = new GuessingGame();

            while (true) {
                System.out.println("Gissa det hemliga nummret:");
                int guessedNumber = scanner.nextInt();
                GuessResult res = game.guess(guessedNumber);
                if (res == GuessResult.CORRECT) {
                    System.out.println("Du gissade rätt!");
                    break;
                }
                else if (res == GuessResult.TOO_HIGH) {
                    System.out.println("Det sökta talet är mindre.");
                }
                else {
                    System.out.println("Det sökta talet är större.");
                }
            }

            System.out.printf("Det tog dig %d gissningar!%n", game.getGuesses());
        }
    }
}
