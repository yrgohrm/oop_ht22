import java.util.ArrayList;
import java.util.List;

public class BadBox {
    public static void main(String[] args) {
        List<Integer> data = List.of(1, 2000, 99, 100, 23, 566);
        List<Integer> small = new ArrayList<>();

        for (int val : data) { // unboxing
            if (val < 1000) {
                small.add(val); // boxing
            }
        }

        for (Integer val : data) { 
            if (val < 1000) { // unboxing
                small.add(val);
            }
        }
    }
}
