import java.util.Scanner;

public class MultTable {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Vilken gångertabell vill du se?");
        int tabell = scanner.nextInt();

        System.out.println("Hur stor är tabellen?");
        int max = scanner.nextInt();

        for (int i = 1; i <= max; ++i) {
            int produkt = i * tabell;
            System.out.printf("%2d x %2d = %3d%n", tabell, i, produkt);
        }
    }
}
