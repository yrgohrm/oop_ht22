import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MyRand {
    public static void main(String[] args) {
        // sämre, worse
        Random r1 = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(r1.nextInt());
        }

        Random r2 = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(r2.nextInt());
        }


        // bättre,better
        Random r3 = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(r3.nextInt());
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(r3.nextInt());
        }

        // ännu bättre
        for (int i = 0; i < 10; i++) {
            System.out.println(ThreadLocalRandom.current().nextInt());
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println(ThreadLocalRandom.current().nextInt());
        }
    }
}
