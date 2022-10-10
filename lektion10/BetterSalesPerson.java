public class BetterSalesPerson extends BetterEmployed {
    private String region;

    public BetterSalesPerson(String name, int age, int wage, String homeOffice, String region) {
        super(name, age, wage, homeOffice);
        this.region = region;
    }

    public String getRegion() {
        return region;
    }
}
