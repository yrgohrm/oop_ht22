import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class UnscientificTest {
    private static final String letters = "abcdefghijklmnopqrst";

    private static String randomString() {
        int size = ThreadLocalRandom.current().nextInt(30);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            int chNum = ThreadLocalRandom.current().nextInt(letters.length());
            char ch = letters.charAt(chNum);
            sb.append(ch);
        }

        return sb.toString();
    }

    private static List<String> randomStrings(int size) {
        var list = new ArrayList<String>();
        for (int i = 0; i < size; i++) {
            list.add(randomString());
        }
        return list;
    }

    public static void main(String[] args) {
        final var data = randomStrings(10000000);

        long start = System.currentTimeMillis();

        var res = data.stream().filter(s -> s.endsWith("s")).map(String::toUpperCase).count();

        long diff = System.currentTimeMillis() - start;

        System.out.println("tid: " + diff + " antal:" + res);

        start = System.currentTimeMillis();

        res = data.stream().map(String::toUpperCase).filter(s -> s.endsWith("S")).count();
        
        diff = System.currentTimeMillis() - start;

        System.out.println("tid: " + diff + " antal:" + res);

        start = System.currentTimeMillis();

        res = data.stream().parallel().filter(s -> s.endsWith("s")).map(String::toUpperCase).count();
        
        diff = System.currentTimeMillis() - start;

        System.out.println("tid: " + diff + " antal:" + res);
    }
}
