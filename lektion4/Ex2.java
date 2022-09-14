import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double heightInMeters = input.nextDouble();
        int bounce = 0;

        while (heightInMeters > 0.01) {
            heightInMeters = heightInMeters * 0.7;
            bounce++;
        }

        System.out.println(bounce);
    }
}
