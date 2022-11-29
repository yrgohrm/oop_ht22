import java.util.*;
import java.util.concurrent.*;

public class Ex5 {
    private static final Queue<Integer> primes = new ConcurrentLinkedQueue<>();

    private static void primeProducer() {
        for (int i = 2; i < 10_000; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
    }

    private static void primeConsumer() {
        while (!Thread.currentThread().isInterrupted()) {
            Integer i = primes.poll();
            if (i != null && containsEight(i)) {
                System.out.println(i);
            }
        }

        while (!primes.isEmpty()) {
            Integer i = primes.poll();
            if (i != null && containsEight(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean containsEight(Integer i) {
        return i.toString().indexOf("8") != -1;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread producer = new Thread(Ex5::primeProducer);
        Thread consumer = new Thread(Ex5::primeConsumer);
        producer.start();
        consumer.start();

        producer.join(); // when this returns the producer has produced all
        consumer.interrupt(); // we can then tell the consumer that the producer is done
        consumer.join(); // and wait for the consumer to be done as well
    }

    private static boolean isPrime(long num) {
        for (long i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
