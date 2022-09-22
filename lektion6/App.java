import org.w3c.dom.css.Rect;

public class App {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.print();

        Rectangle2 rect2 = new Rectangle2(10, 10);
        rect2.print();

        Rectangle2 rect3 = new Rectangle2(33);
        rect3.print();

        Rectangle2 rect4 = new Rectangle2("red");
        rect4.print();

        if (rect4.getHeight() < 12) {
            int i = 10;

            {
                int ii = 0;
                System.out.println(ii);
            }

        }
    }
}
