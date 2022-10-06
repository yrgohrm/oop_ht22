public class ArrayTest5 {
    public static void main(String[] args) {
        String[] badWords = new String[5];

        badWords[0] = "frack";
        badWords[1] = "darn";


        for (String word : badWords) {
            if (word != null) {
                System.out.println(word.toUpperCase());
            }
        }
    }
}
