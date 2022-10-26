import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEx1 {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>(List.of("apa", "bepa", "cepa"));
        // List<String> data = List.of("apa", "bepa", "cepa");

        Iterator<String> it1 = data.iterator();
        Iterator<String> it2 = data.iterator();
        
        while (it1.hasNext()) {
            String res = it1.next();
            System.out.println(res);
            it1.remove();
        }
        
        // don't do this
        it2.next();

        // don't do this
        // for (String str : data) {
        //     data.remove(str);
        // }

        System.out.println(data);
    }
}
