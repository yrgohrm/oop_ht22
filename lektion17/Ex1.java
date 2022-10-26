import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ex1 {
    public static void main(String[] args) {
        Collection<String> names = readAllName();
        String winnerName = drawWinner(names);
        announceWinner(winnerName);
    }

    private static void announceWinner(String winnerName) {
        System.out.println("Vinnaren är " + winnerName);
    }

    private static String drawWinner(Collection<String> names) {
        // draw a random number so we have one number for each name
        // in the collection
        int winnerNo = ThreadLocalRandom.current().nextInt(names.size());
        
        // the new iterator will point to one element BEFORE the first
        Iterator<String> winnerIt = names.iterator();

        // skip over every non winner
        for (int i = 0; i < winnerNo; i++) {
            winnerIt.next();
        }

        // get the winner
        return winnerIt.next();
    }

    private static Collection<String> readAllName() {
        Collection<String> names = new HashSet<>();

        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                System.out.println("Skriv in ett namn: ");
                String name = input.nextLine();
                // stop reading names when we enter an empty line (or containing only whitespace)
                if (name.trim().isEmpty()) {
                    break;
                }

                // the set class will return "false" if the name
                // already exist in the set
                if (!names.add(name)) {
                    System.out.println("Du finns redan med din rackare!");
                }
            }
        }

        return names;
    }
}
