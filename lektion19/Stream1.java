import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Stream1 {
    public static void main(String[] args) {
        // List<String> names = List.of("Hampus", "   ", "Nahid", "Anders", "Eva");

        // names.stream().filter(Predicate.not(String::isBlank)).map(String::toUpperCase)
        //         .forEach(System.out::println);
        
        // names.stream().filter(Predicate.not(String::isBlank)).map(String::length)
        //         .sorted().forEach(System.out::println);


        List<Integer> data2 = List.of(1,2,3,4,5,6,7);
        var newList = data2.stream().skip(3).limit(3).collect(Collectors.toList());
        
        // java 17
        // var newList = data2.stream().skip(3).limit(3).toList();

        System.out.println(newList);
    }
}
