import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Broken {
    private static int min(List<Integer> values) {
        if (values == null || values.isEmpty()) {
            throw new IllegalArgumentException("list must not be empty");
        }

        int minValue = values.get(0);

        for (int i = 1; i < values.size(); ++i) {
            int value = values.get(i);
            if (minValue > value) {
                minValue = value;
            }
        }

        return minValue;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Integer> values = new ArrayList<>();
            int i;
            while ((i = scanner.nextInt()) != 0) {
                values.add(i);
            }

            if (values.isEmpty()) {
                System.out.println("You did not enter any numbers.");
            }
            else {
                System.out.println("Min value: " + min(values));
            }
        }
    }
}
