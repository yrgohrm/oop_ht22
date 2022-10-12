public class FinallyTest {
    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException();
        }
        finally {
            System.out.println("in finally");
        }

        // System.out.println("after finally");
    }
}
