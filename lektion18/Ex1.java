import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Ex1 {
    public static StringAndInt replaceNumbers(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                sb.append("*");
                count++;
            }
            else {
                sb.append(ch);
            }
        }
        
        StringAndInt retVal = new StringAndInt(sb.toString(), count);
        return retVal;
    }

    public static TwoObjects replaceNumbersO2(String str) {
        StringBuilder sb = new StringBuilder();
        long count = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                sb.append("*");
                count++;
            }
            else {
                sb.append(ch);
            }
        }
        
        // this is String, Long
        TwoObjects retVal = new TwoObjects(sb.toString(), count);
        return retVal;
    }

    public static void main(String[] args) {
        StringAndInt val = replaceNumbers("abc123");
        System.out.println(val.newString);
        System.out.println(val.count);
        System.out.println(val.count + 5);

        TwoObjects val2 = replaceNumbersO2("abc123");
        System.out.println(val2.o1);
        System.out.println(val2.o2);
        // Integer != Long
        //System.out.println(((Integer)val2.o2) + 5);

        Pair<String, Integer> pair1 = new Pair<>();
        pair1.val1 = "hejsan";
        pair1.val2 = 123;

        Pair<Integer, Double> pair2 = new Pair<>();
        pair2.val1 = 123;
        pair2.val2 = 23.23;

        var foo = 12;
        var bar = 12.3;
        System.out.println(foo + bar);

        // can't do
        // foo = 12.5;

        // try (BufferedReader reader = Files.newBufferedReader(Path.of("apa.txt"))) {

        // }

        var apa = new ArrayList<String>();
        var bepa = List.of("hej", "hallå", "alla");

        System.out.println(apa + " " + bepa);
    }
}
