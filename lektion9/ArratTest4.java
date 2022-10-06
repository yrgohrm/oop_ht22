public class ArratTest4 {
    public static void main(String[] args) {
        int[] data = { 4, 3, 2, 1};
        int[] data2 = data;

        data2[0] = 9999;

        for (int val : data) {
            System.out.println(val);
        }
    }
}
