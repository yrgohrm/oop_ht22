public class App2 {
    public static void main(String[] args) {
        int[] data = { 1, 2, 3, 4 };

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
            data[i] = 0;
        }

        for (int val : data) {
            System.out.println(val);
        }
    }
}
