import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> data = List.of("apa", "bepa", "cepa");

        for (String s : data) {
            System.out.println(s);
        }

        Iterator<String> it = data.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }

        // if data2 is large this will be slow
        List<String> data2 = new LinkedList<>(List.of("apa", "bepa", "cepa"));
        for (int i = 0; i < data2.size(); i++) {
            String s = data2.get(i);
            System.out.println(s);
        }
    }
}