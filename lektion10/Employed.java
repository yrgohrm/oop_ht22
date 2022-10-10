public class Employed {
    private String name;
    private int age;
    private int wage;
    private String homeOffice;
    
    public Employed(String name, int age, int wage, String homeOffice) {
        this.name = name;
        this.age = age;
        this.wage = wage;
        this.homeOffice = homeOffice;
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

    
}
