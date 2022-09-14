import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        do {
            System.out.println("Skriv in ett tal:");
            n = input.nextInt();
        } while (n < 0);

        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        System.out.println(res);
    }
}
