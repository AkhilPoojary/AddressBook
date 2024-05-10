package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

    List<Contact> contact=new ArrayList<Contact>();

    public Contact createContact()
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("enter the first name");

        String firstName=sc.next();

        System.out.println("enter the last name");

        String lastName=sc.next();

        System.out.println("enter the address");

        String address=sc.next();

        System.out.println("enter the city");

        String city=sc.next();

        System.out.println("enter the state");

        String state=sc.next();

        System.out.println("enter the zip");

        int zip=sc.nextInt();

        System.out.println("enter the phone number");

        long phoneMNumber=sc.nextLong();

        System.out.println("enter the email");

        String email=sc.next();

      Contact c=new Contact(firstName,lastName,address,city,state,email,zip,phoneMNumber);

return  c;
    }
}
