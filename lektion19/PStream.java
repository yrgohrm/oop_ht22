import java.util.ArrayList;
import java.util.List;

public class PStream {
    public static void main(String[] args) {
        var data = new ArrayList<Integer>();
        for (int i = 0; i < 1000; i++) {
            data.add(i);
        }

        // inte speciellt bra
        List<Integer> data2 = new ArrayList<>();
        data.stream().parallel().map(s -> s + 1).forEach(s -> data2.add(s));

        System.out.println(data2.size());
    }
}
