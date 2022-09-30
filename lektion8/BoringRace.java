public class BoringRace {
    public static void main(String[] args) {
        Driveable ford = new FordSMax();
        race(ford);
        
        StreetLeagal kegg = new Koenigsegg();
        race(kegg);

        StreetLeagal kia = new Kia();
        race(kia);
        
        Driveable bil = kia;
        bil.accelerate(12);
    }

    public static void race(Driveable car) {
        while (car.getFuelAmount() > 0) {
            car.accelerate(100);
            car.turn(90);
            car.turn(-90);
            car.accelerate(100);
        }

        car.stop();
    }
}
