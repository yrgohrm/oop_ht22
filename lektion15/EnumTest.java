public class EnumTest {
    public static void main(String[] args) {
        Suit s = Suit.DIAMONDS;

        System.out.println(s.ordinal());

        for (Suit suit : Suit.values()) {
            System.out.println(suit);
        }
    }
}
