package com.magic.addressbook.entity;

import java.util.ArrayList;
import java.util.List;

public class MultiplePerson {

    List<Person> contacts = new ArrayList<>();
    public List<Person> getContacts(){
        return contacts;

    }

    @Override
    public String toString() {
        return "MultiplePerson{" +
                "contacts=" + contacts +
                '}';
    }
}
