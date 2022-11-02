import java.util.ArrayList;
import java.util.Collections;

public class PairExMain {
    public static void main(String[] args) {
        PairEx<String> data1 = new PairEx<>("Bosse", "Bredsladd");
        System.out.println(data1.getValue1());
        System.out.println(data1.getValue2());

        var data2 = new ArrayList<PairEx<Integer>>();
        data2.add(new PairEx<>(1, 0));
        data2.add(new PairEx<>(0, 0));
        data2.add(new PairEx<>(1, -1));
        data2.add(new PairEx<>(2, -1));

        Collections.sort(data2);

        System.out.println(data2);
    }
}
