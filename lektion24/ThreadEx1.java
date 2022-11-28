import java.util.concurrent.ThreadLocalRandom;

public class ThreadEx1 {
    private static class PrintRunner implements Runnable {
        public void run() {
            int random = ThreadLocalRandom.current().nextInt(10);
            for (int i = 0; i < 200; ++i) {
                System.out.print(random + " ");
            }
        }
    }

    public static void main(String[] args) {
        PrintRunner pr1 = new PrintRunner();
        PrintRunner pr2 = new PrintRunner();
        PrintRunner pr3 = new PrintRunner();

        Thread t1 = new Thread(pr1, "nisse");
        Thread t2 = new Thread(pr2, "bosse");
        Thread t3 = new Thread(pr3, "lena");
        // Thread t4 = new Thread(() -> System.out.print("h"));

        t1.start();
        t2.start();
        t3.start();
        // t4.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("x ");
        }
    }
}