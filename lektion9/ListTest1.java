import java.util.Iterator;
import java.util.List;

public class ListTest1 {
    public static void main(String[] args) {
        List<String> list = List.of("Apa", "Bepa", "Cepa", "Depa");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String nextValue = it.next();
            if (it.hasNext()) {
                it.next();
            }
            
            System.out.println(nextValue);
        }
    }
}
