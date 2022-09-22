import java.util.ArrayList;

public class Crash {
    public static void main(String[] args) {
        // oops(0);
        oops2();
    }

    public static void oops(int i) {
        System.out.println(i);
        oops(i+1);
    }

    public static void oops2() {
        var data = new ArrayList<String>();

        while (true) {
            data.add("hello worldfgk idsuf iuf isduf isuf sidu fisud ifus fi");
        }
    }
}
