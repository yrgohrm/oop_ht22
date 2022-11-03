import java.util.function.Predicate;

public class EndsWithS implements Predicate<String> {

    @Override
    public boolean test(String t) {
        return t.endsWith("s");
    }
}
