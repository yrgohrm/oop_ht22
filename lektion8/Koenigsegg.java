public class Koenigsegg implements StreetLeagal {
    private int fuelLevel = 5;

    @Override
    public void turn(double angle) {
        System.out.println("zoooom " + angle);
    }

    @Override
    public void accelerate(int amount) {
        if (fuelLevel > 0) {
            System.out.println("WROOOOM WROOOOM!");
            fuelLevel -= 2;
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

    @Override
    public void turnOnLights() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void blinkLeft() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void blinkRight() {
        // TODO Auto-generated method stub
        
    }
    
}
