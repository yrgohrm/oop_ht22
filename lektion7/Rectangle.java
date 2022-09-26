import java.io.PrintStream;

public class Rectangle {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public void print() {
        System.out.println("Hallo!");
        print(System.out);
    }

    public void print(PrintStream ps) {
        ps.printf("w: %.2f, h: %.2f%n", width, height);
    }

    public void print(int times) {
        print(times, System.out);
    }

    public void print(int times, PrintStream ps) {
        for (int i = 0; i < times; ++i) {
            print(ps);
        }
    }

    public void foo(int num) {
        System.out.println("Foo int " + num);
    }

    public void foo(short num) {
        System.out.println("Foo short " + num);
    }
}
