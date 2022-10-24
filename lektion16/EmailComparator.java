import java.util.Comparator;

// en Comparator är en klass som implementerar en jämförelse mellan
// två objekt av en annan klass
public class EmailComparator implements Comparator<AddressBookEntry> {
    public int compare(AddressBookEntry ab1, AddressBookEntry ab2) {
        String email1 = ab1.getEmail();
        String email2 = ab2.getEmail();

        return email1.compareTo(email2);
    }
}
