import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AddressMain {
    public static void main(String[] args) {
        AddressBookEntry lena = new AddressBookEntry("Lena", "lena@lamm.se", "0733123456");
        AddressBookEntry bosse = new AddressBookEntry("Bosse", "bosse@lamm.se", "0733654321");
        AddressBookEntry nisse = new AddressBookEntry("Nisse", "nisse@lamm.se", "0733111111");

        int r1 = lena.compareTo(bosse);
        if (r1 < 0) {
            System.out.println("Lena skall ligga före");
        }
        else if (r1 == 0) {
            System.out.println("Lena är samma");
        }
        else {
            System.out.println("Lena skall ligga efter");
        }

        int r2 = bosse.compareTo(lena);
        System.out.println(r2);

        List<AddressBookEntry> addressBook = new ArrayList<>();
        addressBook.add(lena);
        addressBook.add(bosse);
        addressBook.add(nisse);

        Collections.sort(addressBook);
        System.out.println(addressBook);

        PhoneComparator pcomp = new PhoneComparator();
        Collections.sort(addressBook, pcomp);
        System.out.println(addressBook);

        Comparator<AddressBookEntry> pcomp2 = Comparator.comparing(AddressBookEntry::getPhone);
        Collections.sort(addressBook, pcomp2.reversed());
        System.out.println(addressBook);

        Comparator<AddressBookEntry> complexComp = Comparator.comparing(AddressBookEntry::getName)
                .thenComparing(AddressBookEntry::getEmail)
                .thenComparing(AddressBookEntry::getPhone);
        Collections.sort(addressBook, complexComp);
        System.out.println(addressBook);

    }
}
