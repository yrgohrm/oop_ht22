import java.util.List;

public class RecordMain {
    public static void main(String[] args) {
        EqualsExRecord r = new EqualsExRecord(12, "hej", List.of(1,2,3));
        System.out.println(r);
        System.out.println(r.bar());
        System.out.println(r.foo());
        System.out.println(r.data());
    }
}
