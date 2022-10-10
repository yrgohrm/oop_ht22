import java.util.ArrayList;
import java.util.List;

public class App3 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Bosse Bredsladd", 64));
        people.add(new Person("Lena Lamm", 45));
        people.add(new Person("Nisse Hult", 42));

        for (Person person : people) {
            System.out.println(person.getName());
        }

        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).getAge());
        }

        people.add(1, new Person("Leyla Smith", 35));

        for (Person person : people) {
            System.out.println(person.getName());
        }

        List<Person> foo = List.of(new Person("Anna Andersson", 32));
        foo.add(new Person("Lars Larsson", 24));
    }
}
