import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Censor {
    private static HashMap<String, String> badWords = new HashMap<>();

    private int wordCount = 0;

    static {
        try {
            var lines = Files.readAllLines(Path.of("bad_words.txt"));
            var it = lines.iterator();
            while (it.hasNext()) {
                badWords.put(it.next(), it.next());
            }
        }
        catch (IOException ex) {
            // this isn't very nice error handling
            ex.printStackTrace();
        }
    }

    public String censor(String text) {
        StringBuilder result = new StringBuilder();
        // whoha! uses lookahead and lookbehind to split
        // and include the delimiter in the output
        // \\W does not handle åäö
        String[] stuff = text.split("((?=\\W)|(?<=\\W))");
        
        for (String word : stuff) {
            String newWord = badWords.get(word.toLowerCase());
            if (newWord != null) {
                result.append(matchCase(newWord, word));
                wordCount++;
            }
            else {
                result.append(word);
            }
        }
        
        return result.toString();
    }
    
    public int getWordCount() {
        return wordCount;
    }

    private static String matchCase(String word, String match) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length() && i < match.length(); i++) {
            if (Character.isUpperCase(match.charAt(i))) {
                result.append(Character.toUpperCase(word.charAt(i)));
            }
            else {
                result.append(word.charAt(i));
            }
        }
        return result.toString();
    }
}
