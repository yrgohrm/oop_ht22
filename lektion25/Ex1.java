public class Ex1 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> print(1000, "Hello"));
        t1.start();

        print(1000, "World");

        t1.join();

        System.out.println("Time to quit!");
    }

    private static void print(int times, String words) {
        for (int i = 0; i < times; i++) {
            System.out.println(words);
        }
    }
}
