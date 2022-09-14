import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Vad heter du?");
        String name = input.nextLine();

        System.out.println("Hur gammal är du?");
        int age = input.nextInt();

        if ("Hampus".equals(name) && age == 40) {
            System.out.println("Hurra för dig");
        }
        else if ("Hampus".equals(name)) {
            System.out.println("Fint namn");
        }
        else if (age > 40) {
            System.out.println("Du är inte purung...");
        }
        else {
            System.out.println("Kul att se dig");
        }
        
        if (age > 40) {
            System.out.println("hahahahaha");
        }
    }
}
