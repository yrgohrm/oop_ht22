import java.util.List;

// från Java 14 har vi records
// ger en immutable-klass med konstruktor, getters, equals, hashCode och toString
// smidigt sätt att slippa skriva kod (eller råka ändra i fel kod)
public record EqualsExRecord(int data, String foo, List<Integer> bar) {
    
}
