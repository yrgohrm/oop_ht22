import java.util.Comparator;

public class PhoneComparator implements Comparator<AddressBookEntry> {
    public int compare(AddressBookEntry ab1, AddressBookEntry ab2) {
        String email1 = ab1.getPhone();
        String email2 = ab2.getPhone();

        return email1.compareTo(email2);
    }
}
