public class Ex2 {
    public static void main(String[] args) {
        try {
            // this should be some resonable code here, not just an exception
            throw new IllegalArgumentException();
        }
        catch (IllegalArgumentException ex) {
            System.err.println("Oops, det gick illa: " + ex.getMessage());
        }
    }
}
