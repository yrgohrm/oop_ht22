public class FordSMax implements Driveable, Stoppable {

    private int fuelLevel = 5;

    @Override
    public void turn(double angle) {
        System.out.println("svääänger " + angle);
        
    }

    @Override
    public void accelerate(int amount) {
        if (fuelLevel > 0) {
            System.out.println("brum brum");
            fuelLevel--;
        }
    }

    @Override
    public void decelerate(int amount) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void shiftGear(int gear) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int getFuelAmount() {
        return fuelLevel;
    }
 
    public void stop() {
        System.out.println("fordstop");
    }
}
