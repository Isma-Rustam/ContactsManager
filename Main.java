package com.company;

public class Main {

    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();
        contactManager.addContact(new Contact("Rustam", "0999079619"));
        contactManager.addContact(new Contact("Ali", "0500777666"));
        contactManager.addContact(new Contact("Anvar", "0700545321"));
        contactManager.addContact(new Contact("Alim", "0555987456"));
    }
}
