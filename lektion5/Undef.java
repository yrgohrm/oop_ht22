public class Undef {
    public static void main(String[] args) {
        int j = 23; // från användaren

        int i;

        if (j < 50) {
            i = 233;
            System.out.println(i);
        }
        else {
            // i har aldrig fått något värde
            System.err.println(i);
        }

        // helt ok
        int k;
        for (k = 0; k < 100; ++k) {
            // bla bka
        }
    }
}
