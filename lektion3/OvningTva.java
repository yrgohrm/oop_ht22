public class OvningTva {
    public static void main(String[] args) {
        double radius = 12.3;
        
        // code goes here, use StrictMath.PI
        // O = 2 * r * PI
        // A = r*r*PI

        double circumference = 2 * radius * StrictMath.PI;
        double area = radius * radius * StrictMath.PI;

        System.out.printf("Omkretsen på cirkeln är %f.\n", circumference);
        System.out.printf("%.2f%n", area);
        System.out.println(area);
    }
}
