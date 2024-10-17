/*  
    NAME : Harsh Sankhe 
    UIN : 231P079
    ROLL NO : 29
    Assignment 1 Q5: 
    Create a simple Java application to manage a contact list using the
    Vector class. The application should allow users to perform the
    following operations:
    1. Add a Contact: Add a new contact with a name and phone
    number.
    2. Remove a Contact: Remove a contact by name.
    3. Display All Contacts: Show all contacts in the list.
    4. Search for a Contact: Search for a contact by name.
*/
import java.util.*;

class Contact {
    String name;
    long number;

    Contact(String name, long number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public long getNumber() {
        return number;
    }
}

public class Assignment1Q5 {

    static Scanner sc = new Scanner(System.in);
    static Vector<Contact> list = new Vector<>();

    public static void addContact() {
        System.out.println("Enter Name Of Contact:");
        String name = sc.next();

        System.out.println("Enter Phone Number of Contact:");
        long number = sc.nextLong();

        Contact newContact = new Contact(name, number);
        list.add(newContact);
    }

    public static void removeContact() {
        if(list.isEmpty()) {
            System.out.println("Your Contact list is empty");
            return;
        }

        System.out.println("Enter the name to remove contact:");
        String reomoveName = sc.next();

        for(int i=0; i<list.size(); i++) {
            Contact c = list.elementAt(i);
            if(c.name.equalsIgnoreCase(reomoveName)) {
                list.remove(i);
                break;
            }
        }
    }

    public static void display() {
        if(list.isEmpty()) {
            System.out.println("Your Contact list is empty");
            return;
        }

        for(Contact c : list) {
            System.out.println("NAME: "+c.name);
            System.out.println("NUMBER: "+c.number);
            System.out.println("--------------------------");
        }
    }

    public static void search() {
        if(list.isEmpty()) {
            System.out.println("Your Contact list is empty");
            return;
        }

        System.out.println("Enter the name to search contact:");
        String searchname = sc.next();

        for(int i=0; i<list.size(); i++) {
            Contact c = list.elementAt(i);
            if(c.name.equalsIgnoreCase(searchname)) {
                System.out.println("Contact Found at: "+i);
                System.out.println("Following are details:");
                System.out.println("NAME: "+c.name);
                System.out.println("NUMBER: "+c.number);
                System.out.println();
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("-----MENU-----");
            System.out.println("1. Add a Contact:");
            System.out.println("2. Remove a Contact:");
            System.out.println("3. Display All Contacts:");
            System.out.println("4. Search for a Contact:");
            System.out.println();
            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    removeContact();
                    break;
                case 3: 
                    display();
                    break;
                case 4:
                    search();
                    break;
                default:
                    System.out.println("Invalid choice!!!");
            }
        }
    }
}
