import java.util.Scanner;

public class TheGame {

    private static Player createPlayer(Scanner input, String num) {
        System.out.println("Vad heter spelare " + num + "?");
        String playerOneName = input.nextLine();

        return new Player(playerOneName);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Player playerOne = createPlayer(input, "ett");
        Player playerTwo = createPlayer(input, "två");

        NumberGame game = new NumberGame(playerOne, playerTwo);

        while (true) {
            System.out.printf("%s gissa på talet. 1-10: ", game.getCurrentPlayerName());
            int guessedNumber = input.nextInt();

            if (game.guess(guessedNumber)) {
                // här har currentPlayer vunnit!!!!
                System.out.printf("%s gissade rätt!%n", game.getCurrentPlayerName());

                if (game.hasPlayerWon()) {
                    System.out.printf("%s vann!%n", game.getCurrentPlayerName());
                    break;
                }
                else {
                    game.newRound();
                    System.out.println("Ny runda påbörjad!");
                    System.out.printf("Poängställning:%n%s %d%n%s %d%n",
                        playerOne.getName(), playerOne.getScore(),
                        playerTwo.getName(), playerTwo.getScore());
                }
            }
        }

    }
}
