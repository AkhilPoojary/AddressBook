package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook
{

    public AddressBook book;

    List<Contact> contact = new ArrayList<Contact>();

    public Contact createContact() {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first name");

        String firstName = sc.next();

        System.out.println("enter the last name");

        String lastName = sc.next();

        System.out.println("enter the address");

        String address = sc.next();

        System.out.println("enter the city");

        String city = sc.next();

        System.out.println("enter the state");

        String state = sc.next();

        System.out.println("enter the zip");

        int zip = sc.nextInt();

        System.out.println("enter the phone number");

        long phoneMNumber = sc.nextLong();

        System.out.println("enter the email");

        String email =sc.next() ;

        Contact c = new Contact(firstName, lastName, address, city, state, email, zip, phoneMNumber);

        return c;
    }

    public List<Contact> addContact() {
        Contact c = createContact();

        contact.add(c);
        return contact;
    }

    public void editContact(String firstName, String lastName) {
        List<Contact> con=book.addContact();

        for(Contact c:con ) {
            if (c.getFirstName().equals(firstName) && c.getLastName().equals(lastName)) {
                Scanner s = new Scanner(System.in);

                int choice = s.nextInt();

                System.out.println(" 1. edit first name");
                System.out.println(" 2. edit second name");
                System.out.println(" 3. edit address");
                System.out.println(" 4. edit zip");
                System.out.println(" 5. edit phone");
                System.out.println(" 6. edit city");
                System.out.println(" 7. edit state");

                switch (choice) {
                    case 1:
                        System.out.println("edit the first name");
                        c.setFirstName(s.next());
                        break;
                    case 2:
                        System.out.println("edit the last name");
                        c.setLastName(s.next());
                        break;
                    case 3:
                        System.out.println("edit the address");
                        c.setAddress(s.next());
                        break;
                    case 4:
                        System.out.println("edit the zip");
                        c.setZip(s.nextInt());
                        break;
                    case 5:
                        System.out.println("edit the phone");
                        c.setPhoneNumber(s.nextLong());
                        break;
                    case 6:
                        System.out.println("edit the city");
                        c.setCity(s.next());
                        break;
                    case 7:
                        System.out.println("edit the state");
                        c.setState(s.next());
                        break;
                    case 8:
                        System.out.println("edit the email");
                        c.setState(s.next());
                        break;
                    case 9:
                        System.out.println("exiting program...");
                        s.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("invalid");
                        break;
                }

            }
        }
    }
    public void delete(String firstName, String lastName)
    {}
}
