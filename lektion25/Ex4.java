public class Ex4 {
    public static void main(String[] args) {
        Thread t1 = new Thread(Ex4::printForever);
        t1.setDaemon(true);
        t1.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("World");
        }
    }

    private static void printForever() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("Hello");
        }
    }
}
