public class DieMain {
    public static void main(String[] args) {
        GameDie d6 = new GameDie();
        GameDie d20 = new GameDie(20);
        
                System.out.println(d6.getAverage());
                System.out.println(d20.getAverage());

        for (int i = 0; i < 100; i++) {
            d6.roll();
            d20.roll();
        }

        System.out.println(d6.getAverage());
        System.out.println(d20.getAverage());

    }
}
