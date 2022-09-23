import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean deleteEverything = false;
        while (true) {
            System.out.println("yes or no?");
            String answer = input.nextLine();

            if ("yes".equals(answer)) {
                deleteEverything = true;
                break;
            } else if ("no".equals(answer)) {
                break;
            }
        }
        
        System.out.println(deleteEverything);
    }
}
