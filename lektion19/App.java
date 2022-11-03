import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        
        List<String> data = new ArrayList<>();
        data.add("hej");
        data.add("hopp");

        String x = data.get(0);
        System.out.println(x.length());


    }
}
