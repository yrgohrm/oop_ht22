import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        int a = 100;
        Integer b = a;
        int c = b;

        System.out.printf("%d %d %d%n", a, b, c);

        List<Integer> data = List.of(1, 2, 3);
        System.out.println(data);

        Integer v1 = Integer.valueOf(1);
        Integer v2 = 1;
        Integer v3 = 1000;
        Integer v4 = 1000;

        System.out.println(v1 == v2);
        System.out.println(v3 == v4);
    }
}