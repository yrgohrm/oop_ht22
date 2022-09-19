import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hur långt skall vi räkna?");
        int count = input.nextInt();

        if (count > 0) {
            // int i = 0;
            // while (i <= count) {
            //     System.out.println(i);
            //     i++;
            // }

            for (int i = 0; i < count; i+=1) {
                System.out.println(i);
            }
        }
    }
}