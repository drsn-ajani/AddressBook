import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook<T extends Contact> {
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

    public void search(String fname, Scanner scanner) {
        for (T contact : contacts) {
            if (contact.getFname().equalsIgnoreCase(fname)) {
                System.out.println("Contact found: " + contact);
                System.out.println("Enter new details:");
                scanner.nextLine();

                System.out.print("Enter First Name: ");
                contact.setFname(scanner.nextLine());

                System.out.print("Enter Last Name: ");
                contact.setLname(scanner.nextLine());

                System.out.print("Enter Address: ");
                contact.setAddress(scanner.nextLine());

                System.out.print("Enter City: ");
                contact.setCity(scanner.nextLine());

                System.out.print("Enter State: ");
                contact.setState(scanner.nextLine());

                System.out.print("Enter ZIP Code: ");
                contact.setZip(scanner.nextLine());

                System.out.print("Enter Phone Number: ");
                contact.setPhNo(scanner.nextLine());

                System.out.print("Enter Email: ");
                contact.setEmail(scanner.nextLine());

                System.out.println("Contact updated successfully!");
                return;
            }
        }
    }
}
