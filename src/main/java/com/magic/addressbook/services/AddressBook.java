package com.magic.addressbook.services;

import com.magic.addressbook.controller.MainClass;
import com.magic.addressbook.entity.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AddressBook implements IaddressBook {
    HashMap<String, List<Person>> addressBook = new HashMap<>();

    @Override
    public void newAddressBook(String name) {
        addressBook.put(name,new ArrayList<>());
    }

    @Override
    public void openAddressbook(String name) {
      MainClass mainclass =  new MainClass();
      mainclass.options(addressBook.get(name));

    }

    @Override
    public void showAllAddressBook() {
        for (Map.Entry mapElement : addressBook.entrySet()) {
            System.out.println((String)mapElement.getKey());
        }
    }

}
