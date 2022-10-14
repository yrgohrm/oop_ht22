public class FinallyTest {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        }
        finally {
            System.out.println("hahahaha");
            throw new IllegalArgumentException();
        }
    }
}
