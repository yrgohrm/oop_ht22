import java.util.List;
import java.util.stream.Collectors;

public class Ex2 {
    public static void main(String[] args) {

        // var names = new ArrayList<String>();

        // try (Scanner input = new Scanner(System.in)) {
        // while (true) {
        // System.out.println("Skriv in ett namn: ");
        // String name = input.nextLine();
        // if (name.trim().isEmpty()) {
        // break;
        // }
        // names.add(name);
        // }
        // }

        var names = List.of("   X", "Lena", "Leyla", "Anders", "Anna");

        /*
         * for (var name : names) { System.out.println(name); }
         */

        var newList = names.stream().map(String::trim).filter(s -> s.length() >= 2)
                .map(String::toLowerCase).collect(Collectors.toList());

        System.out.println(newList);
    }
}
