public class InstanceOfTest {
    public static void main(String[] args) {
        
        BetterSalesPerson bsp = new BetterSalesPerson("Lena Lamm", 43, 55600, "Storstan", "Norr");
        doStuff(bsp);

        Person p = new Person("Jim Smith", 28);
        doStuff(p);
    }

    private static void doStuff(Person p) {
        if (p instanceof BetterSalesPerson) {
            BetterSalesPerson bsp = (BetterSalesPerson)p;
            System.out.println("sälj " + bsp.getRegion());
        }
        else if (p instanceof BetterEmployed) {
            System.out.println("anställd");
        }
        else {
            System.out.println("Något annat");
        }
    }
}
