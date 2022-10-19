public class Ovn2 {
    public CharType getType(char c) {
        final String vowels = "aouåeiyäö";

        if (vowels.indexOf(Character.toLowerCase(c)) >= 0) {
            return CharType.VOWEL;
        }
        else if (Character.isAlphabetic(c)) {
            return CharType.CONSONANT;
        }

        return CharType.OTHER;
    }
}
