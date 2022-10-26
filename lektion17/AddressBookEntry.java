import java.util.Comparator;

public class AddressBookEntry 
       implements Comparable<AddressBookEntry> {
    private String name;
    private String email;
    private String phone;

    // some constructors and other code
    
    @Override
    public int compareTo(AddressBookEntry o) {
        // int res = name.compareTo(o.name);
        // if (res != 0) {
        //     return res;
        // }

        // res = email.compareTo(o.email);
        // if (res != 0) {
        //     return res;
        // }

        // return phone.compareTo(o.phone);

        Comparator<AddressBookEntry> comp =
            Comparator.comparing(AddressBookEntry::getName)
                .thenComparing(AddressBookEntry::getEmail)
                .thenComparing(AddressBookEntry::getPhone);
        return comp.compare(this, o);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
