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

    @Override
    public void showPersonCity(String city) {
       int count = 0;
        for (Map.Entry mapElement : addressBook.entrySet()) {
            System.out.println((String)mapElement.getKey());
            String key = null;
            List<Person> contacts = addressBook.get((String) mapElement.getKey());
            for(Person contact : contacts){
                if(contact.getCity().equalsIgnoreCase(contact.getCity())){

                    System.out.println(contact);
                    count++;
                }
            }

        }
        System.out.println("person is from "+ city);
    }
    @Override
    public void showCountInCity(String state){
        for (Map.Entry mapElement : addressBook.entrySet()) {
            System.out.println((String) mapElement.getKey());
            List<Person> contacts = addressBook.get((String) mapElement.getKey());
            System.out.println(contacts.stream().filter(n -> n.getCity().equalsIgnoreCase(state)).count() + "you are from " + state);
        }
        }
}
