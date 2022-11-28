import java.util.*;

public class SynchBlockEx1 {

    public synchronized void doStuff() {
        System.out.println("start doStuff");

        sleep(1000);

        System.out.println("end   doStuff");
    }

    public synchronized void otherStuff() {
        System.out.println("start otherStuff");

        sleep(1000);

        System.out.println("end   otherStuff");
    }

    public static void main(String[] args) throws InterruptedException {
        final SynchBlockEx1 sb = new SynchBlockEx1();

        Thread t1 = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                sb.doStuff();
            }
        });

        Thread t2 = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                sb.otherStuff();
            }
        });

        t1.start();
        t2.start();

        sleep(10000);

        t1.interrupt();
        t2.interrupt();

        t1.join();
        t2.join();
    }

    private static void sleep(int time) {
        try {
            Thread.sleep(time);
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

}
