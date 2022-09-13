import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Skriv in bredden på en rektangel:");
        double width = input.nextDouble();
        
        System.out.println("Skriv in höjd på en rektangel:");
        double height = input.nextDouble();

        double area = width * height;
        double circumference = width * 2 + height * 2;

        System.out.printf("Omkretsen är %.2f%n", circumference);
        System.out.printf("Arean är %.2f%n", area);
    }
}
