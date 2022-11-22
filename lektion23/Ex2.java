import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        // Locale locale = new Locale("en", "US");
        Locale locale = new Locale("en", "GB");
        // Locale locale = new Locale("sv", "SE");
        ResourceBundle bundle = ResourceBundle.getBundle("translations", locale);

        System.out.println(bundle.getString("hello"));

        String text = String.format(locale, bundle.getString("numbers"), 22, Math.PI);
        System.out.println(text);
    }
}
