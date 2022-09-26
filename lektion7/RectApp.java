public class RectApp {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20);

        r1.print(System.out);
        r1.print(5);

        short val = 2;
        short val2 = 1;
        r1.foo(val + val2);
    }
}
