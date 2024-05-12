package org.example;

import java.util.ArrayList;
import java.util.*;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

//    public AddressBook book;

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

        String email = sc.next();


        Contact c = new Contact(firstName, lastName, address, city, state, email, zip, phoneMNumber);
        c.setFirstName(firstName);
        c.setLastName(lastName);
        c.setAddress(address);
        c.setCity(city);
        c.setState(state);
        c.setEmail(email);
        c.setZip(zip);
        c.setPhoneNumber(phoneMNumber);
        return c;
    }

    public List<Contact> addContact() {
        Scanner sc=new Scanner(System.in);
        boolean edit = true;
        while (edit)
        {
            Contact c = createContact();
            contact.add(c);
            System.out.println("contact added successfully");
            System.out.println("do you want to add contact ? (true/false)");
            edit=sc.nextBoolean();
        }
        return contact;
    }

    public void display() {
        System.out.println("The details of contacts in the address book are:");

        for(Contact c : contact) {
            System.out.println(c);
            // You can print other details as well similarly
        }
    }

    public void editContact(String firstName, String lastName) {
        List<Contact> con =addContact();

        Scanner s = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            for (Contact c : con) {
                if (c.getFirstName().equals(firstName) && c.getLastName().equals(lastName)) {


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
                            exit = true;
                            break;
                        default:
                            System.out.println("invalid");
                            break;
                    }

                }
            }
        }
        for(Contact c:con)
        {
            System.out.println(c);
        }
    }

    public void delete(String firstName, String lastName) {
        List<Contact> con =addContact();

        for (Contact c : con) {
            if (c.getFirstName().equals(firstName) && c.getLastName().equals(lastName)) {
                con.remove(c);
            }
        }
    }

    public void addMultipleAddressBook() {

        Scanner sc=new Scanner(System.in);

        Map<String,AddressBook> addressBookMap=new HashMap<String,AddressBook>();

        while(true)
        {
            System.out.println("add new addressBookMap ? (yes/no");
            String choice=sc.next();
            if(choice.equalsIgnoreCase("no"))
                break;
            else{
                System.out.println("enter the name of the addressBook");
                String addressBookName=sc.next();

                AddressBook addressBook=new AddressBook();
                addressBookMap.put(addressBookName,addressBook);
                System.out.println("new address book added with the name "+addressBookName);
            }
        }
//        now we are adding the person to the selected address book

        System.out.println("select an address book from the collection of the address book");
        for(String name : addressBookMap.keySet())
        {
            System.out.println(name);
        }

        System.out.println("enter the address book");
        String nameOfBook=sc.next();

        AddressBook addressBook = addressBookMap.get(nameOfBook);
        if(addressBook==null)
        {
            System.out.println("book not found");
        }
        else{
            addContactToAddressBook(addressBook);
        }

    }
  public void  addContactToAddressBook(AddressBook addressBook)
  {
      Scanner sc=new Scanner(System.in);
      while(true)
      {
          System.out.println("add new person to the address book ?(yes/no");
          String choice=sc.next();
          if(choice.equalsIgnoreCase("no"))
              break;
          else{
            addressBook.addContact();
              System.out.println("person added to new address Book");
          }

      }
  }





}
