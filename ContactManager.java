package com.company;

public class ContactManager {
    Contact[] contacts = new Contact[10];
    int contactCount = 0;

    public void addContact(Contact c) {
        contacts[contactCount] = c;
        contactCount++;
    }

    public Contact searchContact(String name) {
        return contacts[0];
    }
}
