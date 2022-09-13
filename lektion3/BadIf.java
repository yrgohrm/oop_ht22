import java.util.Scanner;

public class BadIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hur gammal är du?");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("Du är myndig.");
            System.out.println("Gå och rösta!");
        }

        System.out.println("Hej då!");
    }
}
