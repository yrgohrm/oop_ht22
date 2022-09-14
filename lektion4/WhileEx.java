import java.util.Scanner;

public class WhileEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Skriv ett bra namn:");
        String name = input.nextLine();

        while (!name.equals("Hampus")) {
            System.out.println("Nä försök igen!");
            name = input.nextLine();
        }

        System.out.println("Nu är det slut");
    }
}
