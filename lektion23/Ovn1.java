import java.util.*;

public class Ovn1 {
    public static void main(String[] args) {
        Locale locale = Locale.forLanguageTag("en-GB");

        try (Scanner input = new Scanner(System.in).useLocale(locale)) {
            // we could do it like this instead
            // input.useLocale(locale);

            final int NUMBER_COUNT = 3;
            double[] numbers = new double[NUMBER_COUNT];

            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Enter a number:");
                numbers[i] = input.nextDouble();
            }

            double mean = sum(numbers) / numbers.length;

            System.out.printf(locale, "The mean value is %.3f%n", mean);
        }
    }

    private static double sum(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum;
    }
}
