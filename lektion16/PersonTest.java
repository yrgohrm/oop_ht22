import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonTest {
    public static void main(String[] args) {
        List<Person> data = new ArrayList<>();
        data.add(new Person("Bosse", "Bredsladd", 56));
        data.add(new Person("Leyla", "Smith", 43));
        data.add(new Person("Omar", "Turesson", 33));
        data.add(new Person("Anna", "Andersson", 33));

        Collections.sort(data);

        System.out.println(data);
    }
}
