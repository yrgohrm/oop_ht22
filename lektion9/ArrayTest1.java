public class ArrayTest1 {
    public static void main(String[] args) {
        int[] data = new int[4];
        data[0] = 3;
        data[1] = 4;
        data[2] = 99;
        data[3] = -12;

        int[] data2 = { 3, 4, 99, -12, 89 };

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

        System.out.println();

        for (int i = 0; i < data2.length; i++) {
            System.out.println(data2[i]);
        }
        
        System.out.println();

        for (int val : data) {
            System.out.println(val);
        }

        for (int i = 0; i < data.length; i++) {
            int val = data[i];

            System.out.println(val);
        }

        System.out.println();

        int i = 0;
        for (int val : data) {
            System.out.println(i + " " + val);
            i++;
        }
    }
}
