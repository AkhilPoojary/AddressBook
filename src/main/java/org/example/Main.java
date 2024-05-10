package org.example;

import java.time.Clock;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book");

        AddressBook book=new AddressBook();

//        book.createContact();
//
//        book.addContact();

        book.editContact();

    }
}