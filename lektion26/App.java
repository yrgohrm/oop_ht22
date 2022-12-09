public class App {
    public static void main(String[] args) {

        identity(3);
        
        System.out.println();

        identity(8);

    }

    public static void identity(final int n) {
        for (int x = 0; x < n; ++x) {
            for (int y = 0; y < n; ++y) {
                String ch = (x == y) ? "1 " : "0 ";
                System.out.print(ch);
            }

            System.out.println("");
        }
    }
}
