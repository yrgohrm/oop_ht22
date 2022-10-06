import java.util.Scanner;

public class ArrayTest3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hur stor array?");
        int size = input.nextInt();
        int[] data = new int[size];

        doStuff(data);

        doStuff(new int[99]);
    }

    private static void doStuff(int[] array) {
        System.out.println(array.length);
    }
}
