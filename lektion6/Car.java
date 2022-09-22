public class Car {
    private String regNo;
    private String model;
    private int year;
    private int serviceWeight;
    private int enginePower;

    public static Car createCar(String regNo, String model, int year, int serviceWeight, int enginePower) {
        Car car = new Car();
        car.setRegNo(regNo);
        car.setModel(model);
        car.setYear(year);
        car.setServiceWeight(serviceWeight);
        car.setEnginePower(enginePower);
        return car;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        if (regNo.length() >= 6 && regNo.length() <= 7) {
            this.regNo = regNo;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getServiceWeight() {
        return serviceWeight;
    }

    public void setServiceWeight(int serviceWeight) {
        this.serviceWeight = serviceWeight;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public void print() {
        System.out.printf("%s %s %d %d %d%n", getRegNo(), 
                getModel(), getYear(), 
                getEnginePower(),
                getServiceWeight());
    }
}
