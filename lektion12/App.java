public class App {
    public static void main(String[] args) {
        int res = fac(-1);
        
        System.out.println(res);
    }

    /**
     * Calculate the factorial.
     * 
     * If n is less than 1 IllegalArgumentException is thrown.
     * 
     * @param n the number to take the factorial for
     * @return the factorial
     * @throws IllegalArgumentException - sdfkdjskdj
     */
    private static int fac(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n can't be less than 1");
        }

        if (n == 1) {
            return 1;
        }
        else {
            return n * fac(n - 1);
        }
    }
}
