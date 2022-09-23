import java.util.concurrent.ThreadLocalRandom;

public class NumberGame {
    private Player playerOne;
    private Player playerTwo;
    private Player currentPlayer;
    private int roundTarget;

    public NumberGame(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        
        this.currentPlayer = playerOne;
        if (ThreadLocalRandom.current().nextBoolean()) {
            this.currentPlayer = playerTwo;
        }

        this.roundTarget = ThreadLocalRandom.current().nextInt(10) + 1; 
    }

    public void newRound() {
        roundTarget = ThreadLocalRandom.current().nextInt(10) + 1;
    }

    public boolean guess(int guessedNumber) {
        if (guessedNumber == roundTarget) {
            // vi har en vinnare!
            currentPlayer.guessedRight();
            return true;
        }
        else {
            // nästa spelare får gissa
            currentPlayer.guessedWrong();
            swapCurrentPlayer();
            return false;
        }
    }

    public String getCurrentPlayerName() {
        return currentPlayer.getName();
    }

    public boolean hasPlayerWon() {
        return currentPlayer.getScore() >= 10;
    }

    private void swapCurrentPlayer() {
        if (currentPlayer == playerOne) {
            currentPlayer = playerTwo;
        }
        else {
            currentPlayer = playerOne;
        }
    }
}
