public class AddressBookEntry implements Comparable<AddressBookEntry> {
    private String name;
    private String email;
    private String phone;

    public AddressBookEntry(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    @Override
    public int compareTo(AddressBookEntry o) {

        // jämför this.name (detta objekts namn) med det andra objektets namn

        return name.compareTo(o.name);
        // return phone.compareTo(o.phone);
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

    @Override
    public String toString() {
        return "AddressBookEntry [name=" + name + ", email=" + email + ", phone=" + phone + "]";
    }

    
}
