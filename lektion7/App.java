import java.util.concurrent.ThreadLocalRandom;

public class App {

    public static boolean sendEmail(String email, String message) {
        System.out.println(email);
        System.out.println(message);
        return ThreadLocalRandom.current().nextBoolean();
    }

    public static int sum(int value) {
        System.out.println(value);
        int sum = 0;
        for (int i = 1; i <= value; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        if (sendEmail("nisse@lammindustries.com", "Välkommen!")) {
            System.out.println("Det sändes iväg!");
        }
        
        sendEmail("lena@lammindustries.com", "Din vinst har ökat!");

        int number = sum(10) + sum(14);
        System.out.println(number);

        int a = 10;
        number = sum(sum(a)) + sum(sum(a));
        System.out.println(number);

        System.out.println(fac(5));
    }

    
    private static int fac(int n) {
        if (n <= 1) {
            return 1;
        }
        else {
            return n * fac(n-1);
        }
    }
}