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
            System.out.println("2. Display all Contact");
            System.out.println("3. Edit a Contact");
            System.out.println("4. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    ab.addContact(createContact());
                    break;
                case 2:
                    ab.display();
                    break;
                case 3:
                    System.out.println("Enter the first name of the contact to edit: ");
                    String firstName = sc.next();
                    ab.search(firstName, sc);
                    break;
                case 4:
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
}