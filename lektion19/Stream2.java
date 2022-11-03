import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Stream2 {
    public static void main(String[] args) {
        List<String> names = List.of("Hampus", "Nahid", "Anders", "Eva");

        var res = names.stream().filter(Stream2::endsWithS).collect(Collectors.toList());
        System.out.println(res);

        var res2 = names.stream().filter(s -> s.endsWith("s")).collect(Collectors.toList());
        System.out.println(res2);

        var res3 = names.stream().filter(new EndsWithS()).collect(Collectors.toList());
        System.out.println(res3);
    }

    public static boolean endsWithS(String s) {
        return s.endsWith("s");
    }
}
