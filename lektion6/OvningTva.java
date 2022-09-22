public class OvningTva {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setRegNo("ABC123");
        car1.setModel("Volvo V60");
        car1.setYear(2016);
        car1.setEnginePower(240);
        car1.setServiceWeight(1345);

        // Car car2 = new Car();
        // car2.regNo = "BBC123";
        // car2.model = "Volvo XC60";
        // car2.year = 2020;
        // car2.enginePower = 240;
        // car2.serviceWeight = 1645;

        System.out.println("Car 1:");
        car1.print();

        // System.out.println("Car 2:");
        // System.out.printf("%s %s %d %d %d%n", car2.regNo, 
        //         car2.model, car2.year, 
        //         car2.enginePower,
        //         car2.serviceWeight);
    }
}
