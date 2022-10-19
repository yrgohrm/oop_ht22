public class Ex2 {
    public static void main(String[] args) {
        Integer v1 = Integer.valueOf(1000);
        Integer v2 = Integer.valueOf(1000);
        Integer v3 = v2;

        System.out.println(v1 == v2);
        System.out.println(v1 <= v2);

        System.out.println(v2 == v3);
    }
}
