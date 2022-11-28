public class ThreadNotStop {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(4000);
            }
            catch (InterruptedException ex) {
                // ignore
            }
            System.out.println("klar");
        });

        t.start();

        System.out.println("slut eller?");
    }
}
