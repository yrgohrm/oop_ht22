public class OvningSex {
    public static void main(String[] args) {
        Car familyCar = Car.createCar("XYZ 12A", "Ford S-Max", 2019, 2401, 160);
        Car donaldsCar = Car.createCar("ANK 313", "Skruttomobil", 1927, 812, 97);
        
        familyCar.print();
        donaldsCar.print();
    }
}
