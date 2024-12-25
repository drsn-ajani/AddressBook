import java.util.ArrayList;
import java.util.List;

public class AddressBook<T> {
    private final List<T> contacts;

    public AddressBook() {
        this.contacts = new ArrayList<>();
    }


    public void addContact(T contact) {
        this.contacts.add(contact);
    }

    public void display() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts are there in the AddressBook..!!");
        } else {
            System.out.println("Contacts in the List:");
            System.out.println(contacts);
        }
    }
}
