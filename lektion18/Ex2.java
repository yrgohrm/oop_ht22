import java.io.BufferedInputStream;
import java.util.Comparator;
import java.util.List;

public class Ex2 {
    public static <T> boolean allSame(List<T> values, Comparator<T> comp) {
        if (values.isEmpty()) {
            return true;
        }

        T first = values.get(0);
        for (T val : values) {
            if (comp.compare(first, val) != 0) {
                return false;
            }
        }

        return true;
    }

    public static <T> void print(T obj) {
        System.out.println(obj);
    }

    public static void foo(List<? extends BufferedInputStream> xxx) {
        BufferedInputStream val = xxx.get(0);
        System.out.println(val);
        // xxx.add(?????);
    }

    public static void bar(List<? super BufferedInputStream> xxx) {
        // not possible
        // BufferedInputStream val = xxx.get(0);
        //System.out.println(val);
        xxx.add(new BufferedInputStream(System.in));
        
    }

    

    public static void main(String[] args) {
        System.out.println(allSame(List.of("apa", "apa", "apa"), Comparator.naturalOrder()));
        System.out.println(allSame(List.of(1, 1, 2), Comparator.naturalOrder()));
    }
}
