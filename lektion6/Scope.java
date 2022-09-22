public class Scope {
    public static void main(String[] args) {
        int var1 = 1;
        int var2 = 100;

        for (int i = 0; i < 2; ++i) {
            int var3 = i * i;
            System.out.println("data: " + (var1 + var2 + var3));
        }

        int var4 = 19;

        System.out.println("data: " + (var1 + var2 + var4));
    }
}
