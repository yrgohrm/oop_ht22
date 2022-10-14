public class App {
    public static int imBadYouKnowIt(int value) {
        Integer[] arr = {Integer.valueOf(0), null, Integer.valueOf(2)};
        int i = (int) (Math.random() * 5);
        return value / arr[i];
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            try {
                imBadYouKnowIt(i);
            }
            catch (NullPointerException | ArrayIndexOutOfBoundsException | ArithmeticException ex) {
                System.out.println("fel");
            }
        }
    }
}
