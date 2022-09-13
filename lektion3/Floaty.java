public class Floaty {
    public static void main(String[] args) {
        double d = 1000000000;

        double accountBalance = d * d * d;
        System.out.println(accountBalance);

        double afterDeposit = accountBalance - 10000;
        
        System.out.println(afterDeposit);

        if (afterDeposit == accountBalance) {
            System.out.println("ajajaj");
        }
    }
}
