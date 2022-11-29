public class Ex1 {
    private static class Printer implements Runnable {
        public void run() {
            for (int i = 0; i < 1000; ++i) {
                System.out.println("Hello");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Printer());
        t1.start();

        for (int i = 0; i < 1000; ++i) {
            System.out.println("World");
        }

        t1.join();
        System.out.println("Time to quit!");
    }
}
