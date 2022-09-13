public class Test {
    public static void main(String[] args) {
        System.out.print("Talet PI med massor av decimaler: " + Math.PI);
        System.out.printf("Talet PI med två decimaler: %.2f%n", Math.PI);

        int i = 1, j = 12, k = 123;
        System.out.println("Högerjusterad 14 tecken:");
        System.out.printf("%4d%n%4d%n%4d", i, j, k);
    }
}
