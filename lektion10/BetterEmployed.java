public class BetterEmployed extends Person {
    private int wage;
    private String homeOffice;
    
    public BetterEmployed(String name, int age, int wage, String homeOffice) {
        super(name, age);
        this.wage = wage;
        this.homeOffice = homeOffice;
    }

    public int getWage() {
        return wage;
    }

    public String getHomeOffice() {
        return homeOffice;
    }

    @Override
    public String toString() {
        return String.format("%s with age %d with wage %d and placed in %s",
            getName(), getAge(), getWage(), getHomeOffice());
    }
}
