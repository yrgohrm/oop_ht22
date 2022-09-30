import java.util.concurrent.ThreadLocalRandom;

public class GameDie {
    private int size;
    private int lastRoll;
    private int numberOfRolls;
    private int sumOfRolls;

    public GameDie() {
        this(6);
    }

    public GameDie(int size) {
        this.size = size;
        this.numberOfRolls = 0;
        this.sumOfRolls = 0;
    }

    public int roll() {
        lastRoll = ThreadLocalRandom.current().nextInt(size) + 1;
        
        numberOfRolls++;
        sumOfRolls += lastRoll;

        return lastRoll;
    }

    public int getLastRoll() {
        return lastRoll;
    }

    public double getAverage() {
        return sumOfRolls / (double)numberOfRolls;
    }
}
