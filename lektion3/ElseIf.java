import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int data = input.nextInt();

        if (data > 300) {
            System.out.println("Data is very big.");
        }
        else if (data > 22) {
            System.out.println("Data is too big");
        }
        else {
            System.out.println("Data is just right");
        }        
    }
}
