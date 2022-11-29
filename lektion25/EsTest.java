import java.util.concurrent.*;

public class EsTest {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(4);
        // ExecutorService service = Executors.newCachedThreadPool();

        for (int i = 0; i < 5; ++i) {
            service.submit(() -> {
                for (int j = 0; j < 5; ++j) {
                    sleep(1000);
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }

        service.shutdown();
        service.awaitTermination(15, TimeUnit.SECONDS);
        System.out.println("XXXXXXXXXXXXXXXX");
    }

    private static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
