import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        // try {
            Scanner input = new Scanner(System.in);
            System.out.println("Vilket av de två alternativen vill du ha?");
            int index = input.nextInt();
            int[] array = {1, 2};
            System.out.printf("%d", array[index]);
            System.out.println("Nu är det slut!");
        // }
        // catch (ArrayIndexOutOfBoundsException ex) {
        //     System.err.println("Oops, det gick illa: " + ex.getMessage());
        // }
    }
}
