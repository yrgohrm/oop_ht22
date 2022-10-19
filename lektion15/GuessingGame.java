import java.util.concurrent.ThreadLocalRandom;

public class GuessingGame {
    private int secretNumber;
    private int guesses;

    public GuessingGame() {
        this.secretNumber = ThreadLocalRandom.current().nextInt(1, 11);
        this.guesses = 0;
    }

    public GuessResult guess(int number) {
        guesses++;

        if (number == secretNumber) {
            return GuessResult.CORRECT;
        }
        else if (number > secretNumber) {
            return GuessResult.TOO_HIGH;
        }
        else {
            return GuessResult.TOO_LOW;
        }
    }

    public int getGuesses() {
        return guesses;
    }
}
