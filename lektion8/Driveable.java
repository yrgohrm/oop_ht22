import java.util.concurrent.ThreadLocalRandom;

public interface Driveable {
    void turn(double angle);
    void accelerate(int amount);
    void decelerate(int amount);
    void shiftGear(int gear);
    int getFuelAmount();

    default void stop() {
        turn(0);
        decelerate(100);
        decelerate(0);
        shiftGear(1);
    }
}
