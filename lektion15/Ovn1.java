import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Ovn1 {
    public static Set<Integer> uniqueRandom(int n) {
        Set<Integer> numbers = new HashSet<>();
        while (numbers.size() < n) {
            numbers.add(ThreadLocalRandom.current().nextInt(20));
        }
        return numbers;
    }

    public static int evenSum(List<Integer> numbers) {
        int sum = 0;
        for (int n : numbers) {
            // if (n % 2 == 0) {
            if ( (n&1) == 0) {
                sum += n;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(evenSum(List.of(1, 2, 3, 4)));
        System.out.println(evenSum(List.of(1, 3, 5, 7)));
        System.out.println(evenSum(List.of(8, 2, 4)));
        System.out.println();

        List<Integer> data = new ArrayList<>(uniqueRandom(4));
        System.out.println(data);
        System.out.println(evenSum(data));
    }
}
