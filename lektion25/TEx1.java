import java.util.concurrent.*;

public class TEx1 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(3);
        // ExecutorService es = Executors.newCachedThreadPool();
        // ExecutorService es = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 5; i++) {
            createJob(i, es);
        }

        es.shutdown();
        
        // we can't submit after shutdown
        // es.submit(() -> {});
        
        es.awaitTermination(10, TimeUnit.SECONDS);
    }

    private static void createJob(int i, ExecutorService es) {
        es.submit(() -> {
            for (int j = 0; j < 50; j++) {
                System.out.println("j" + i);
            }
        });
    }
}
