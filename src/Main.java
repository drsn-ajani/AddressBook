import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook Program\n");

//        Contact contact = new Contact("drsn", "A", "xyz", "xyz", "xyz", "1234", "1234567891", "xyz@xyz.com");
//
//        System.out.println(contact);

        AddressBook<Contact> ab = new AddressBook<>();

        Scanner sc = new Scanner(System.in);
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
                    System.out.println("Invalid choice, please enter 1, 2 or 3");
                    break;
            }
        } while (!done);

        sc.close();


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