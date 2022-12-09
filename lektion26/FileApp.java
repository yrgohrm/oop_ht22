import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class FileApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }

        // n = antalet filer? inte så bra, olika stora filer
        // n = antalet rader? inte så bra, olika långa rader
        // n = antalet tecken? bra!

        // O( ???? n ???? ), där n = totala antalet tecken

        boolean ignoreCase = args[0].equals("-i");

        var freq = Arrays.stream(args)              // O(1)
                    .skip(ignoreCase ? 1 : 0)       // O(1)
                    .flatMap(FileApp::read)         // O(1) map hade gett Stream<Stream<String>>, flatMap Stream<String>
                    .flatMapToInt(String::chars)    // O(1) Stream<String> -> IntStream (ström av tal)
                    .filter(cp -> !Character.isWhitespace(cp))  // O(n)
                    .map(ignoreCase ? Character::toLowerCase : IntUnaryOperator.identity()) // O(n)
                    .collect(TreeMap::new, FileApp::mapAppend, FileApp::mapMerge); // O(n log n)

        // totala komplexiteten för detta ovanför: O(n log n)

        // loopen nedan: O(n)
        freq.entrySet().forEach(e -> {
            System.out.printf("%c - %d%n", e.getKey(), e.getValue());
        });

        // komplexiteten för allt: O(n log n)
        // om vi hade en hashmap och inte behöver sortera: O(n)
    }

    private static Stream<String> read(String file) {
        try {
            return Files.lines(Path.of(file));
        }
        catch (IOException ex) {
            System.out.println("Unable to read file " + file);
            return Stream.empty();
        }
    }

    private static void mapAppend(Map<Character, Integer> map, int cp) {
        for (char ch : Character.toChars(cp)) {
            map.merge(ch, 1, Integer::sum); // hashmap: O(1), treemap: O(log n)
        }
    }

    private static void mapMerge(Map<Character, Integer> map1, Map<Character, Integer> map2) {
        for (var entry : map2.entrySet()) {
            map1.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }
    }
}