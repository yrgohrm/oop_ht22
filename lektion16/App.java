import java.util.List;

public class App {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        List<Integer> data = List.of(a, b, c);
        System.out.println(data);

        int val = 2200;
        Integer val2 = Integer.valueOf(2200);

        if (val == val2) {
            System.out.println("Samma");
        }

        Suit theSuit = Suit.CLUBS;
    }
}