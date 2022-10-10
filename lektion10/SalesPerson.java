public class SalesPerson {
    private String name;
    private int age;
    private int wage;
    private String homeOffice;
    private String region;

    public SalesPerson(String name, int age, int wage, String homeOffice, String region) {
        this.name = name;
        this.age = age;
        this.wage = wage;
        this.homeOffice = homeOffice;
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWage() {
        return wage;
    }

    public String getHomeOffice() {
        return homeOffice;
    }

    public String getRegion() {
        return region;
    }
}
