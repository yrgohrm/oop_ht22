import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     
        System.out.println("What's your name?");
        String name = input.nextLine();

        System.out.println("How old are you?");
        int age = input.nextInt();

        if ("Hampus" == name) {
            System.out.println("You have a really great name!");
        }
        else {
            System.out.printf("Hello %s! You are %d years old.%n", name, age);
        }

        input.close();
    }
}
