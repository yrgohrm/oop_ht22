import java.util.Iterator;
import java.util.List;

public class StringB {
    public static void main(String[] args) {
        List<String> list = List.of("Apa", "Bepa", "Cepa", "Depa");

        String all = "";
        for (String val : list) {
            all += val + " ";
        }

        System.out.println(all);

        StringBuilder sb = new StringBuilder();
        for (String val : list) {
            sb.append(val);
            sb.append(" ");
        }

        System.out.println(sb.toString());
    }
}
