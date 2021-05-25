package com.magic.addressbook.services;
import com.magic.addressbook.entity.Person;

public interface Ioptions {
    void addcontact();

    void edit(String first_name, String last_name, Person person);

    void delete(String first_name, String last_name);

    void display();
}

