import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapEx2 {
    public static void main(String[] args) {
        Map<String, List<String>> children = new HashMap<>();

        List<String> anna = new ArrayList(List.of("Anna"));
        children.put("Bosse Bredsladd", anna);

        children.get("Bosse Bredsladd").add("Lisa");
        // children.compute("Bosse Bredsladd", (k, l) -> { l.add("Andrea"); return l; });

    }
}
