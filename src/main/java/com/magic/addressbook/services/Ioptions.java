package com.magic.addressbook.services;
import com.magic.addressbook.entity.Person;

import java.util.List;

public interface Ioptions {
    void addcontact(List<Person> contacts);

    void edit(String first_name, String last_name, List<Person> contacts);

    void delete(String first_name, String last_name, List<Person> contacts);

    void display(List<Person> contacts);
}

