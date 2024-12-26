import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook Program\n");

//        Contact contact = new Contact("drsn", "A", "xyz", "xyz", "xyz", "1234", "1234567891", "xyz@xyz.com");
//        System.out.println(contact);

        HashMap<String, AddressBook<Contact>> address_book_system = new HashMap<>();
        Scanner sc = new Scanner(System.in);

//        AddressBook<Contact> ab = new AddressBook<>();
        AddressBook<Contact> current_ab = null;
        boolean done = false;

        do {
            System.out.println("\tChoose your options:");
            System.out.println("1. Crete a new AddressBook");
            System.out.println("2. Select an AddressBook");
            System.out.println("3. Displaying Existing AddressBook");
            System.out.println("4. Manage Contacts in the AddressBook");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            sc.nextLine();
            String name;

            switch(choice) {
                case 1:
                    System.out.println("Enter the name of the new AddressBook: ");
                    name = sc.nextLine();
                    if (address_book_system.containsKey(name)) {
                        System.out.println("Address Book already exists!");
                    } else {
                        AddressBook<Contact> newAddressbook = new AddressBook<>();
                        address_book_system.put(name, newAddressbook);
                        System.out.println("New AddressBook created!");
                    }
                    break;
                case 2:
                    System.out.println("Enter the name of the AddressBook you want to access: ");
                    name = sc.nextLine();
                    if (address_book_system.containsKey(name)) {
                        current_ab = address_book_system.get(name);
                        System.out.println("Switched to AddressBook " + name);
                    } else {
                        System.out.println("AddressBook not found!");
                    }
                    break;
                case 3:
                    System.out.println("Available AddressBooks are: ");
                    if (address_book_system.isEmpty()) {
                        System.out.println("No AddressBook found!");
                    } else {
                        for (String key : address_book_system.keySet()) {
                            System.out.println("- " + key);
                        }
                    }
                    break;
                case 4:
                    if (current_ab != null) {
                        System.out.println("Current AddressBook is " + current_ab);
                        manageAddressBook(current_ab, sc);
                    } else {
                        System.out.println("No AddressBook is selected..!!");
                    }
                    break;
                case 5:
                    done = true;
                    break;
                default:
                    System.out.println("Please enter a valid option!");
                    break;


            }

        } while (!done);



        sc.close();


    }

    public static void manageAddressBook(AddressBook<Contact> ab, Scanner sc) {

        boolean done = false;

        do {
            System.out.println("\tChoose an option");
            System.out.println("1. Add a new Contact");
            System.out.println("2. Add Multiple New Contact");
            System.out.println("3. Display all Contact");
            System.out.println("4. Edit a Contact");
            System.out.println("5. Delete a Contact");
            System.out.println("6. Exit");
            int choice = sc.nextInt();

            String firstName;

            switch (choice) {
                case 1:
                    ab.addContact(createContact());
                    break;
                case 2:
                    add_multiple_contact(ab);
                    break;
                case 3:
                    ab.display();
                    break;
                case 4:
                    System.out.println("Enter the first name of the contact to edit: ");
                    firstName = sc.next();
                    ab.search(firstName, sc);
                    break;
                case 5:
                    System.out.println("Enter the first name of the contact to delete: ");
                    firstName = sc.next();
                    ab.delete(firstName, sc);
                    break;
                case 6:
                    done = true;
                    break;
                default:
                    System.out.println("Invalid choice, please enter valid number!");
                    break;
            }
        } while (!done);

    }




    public static Contact createContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String fname = sc.nextLine();
        System.out.println("Enter the last name: ");
        String lname = sc.nextLine();
        System.out.println("Enter the Address: ");
        String Address = sc.nextLine();
        System.out.println("Enter the City: ");
        String City = sc.nextLine();
        System.out.println("Enter the State: ");
        String State = sc.nextLine();
        System.out.println("Enter the ZIP: ");
        String zip = sc.nextLine();
        System.out.println("Enter the Phone: ");
        String Phone = sc.nextLine();
        System.out.println("Enter the Email: ");
        String Email = sc.nextLine();
        Contact c1 = new Contact(fname, lname, Address, City, State, zip, Phone, Email);
        return c1;
    }


    public static void add_multiple_contact(AddressBook<Contact> ab) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of contacts you want to add: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            ab.addContact(createContact());
        }

        System.out.println(n + " contacts added successfully");
    }
}