package com.magic.addressbook.services;
import com.magic.addressbook.entity.Person;

import java.util.*;
public class Options implements Ioptions {

    Person person = new Person();
    ArrayList<Person> contacts = new ArrayList<Person>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addcontact() {
        System.out.println("first name");
        person.setFirst_name(scanner.nextLine());
        System.out.println("last name");
        person.setLast_name(scanner.nextLine());
        System.out.println("address");
        person.setAddress(scanner.nextLine());
        System.out.println("city");
        person.setCity(scanner.nextLine());
        System.out.println("state");
        person.setState(scanner.nextLine());
        System.out.println("zip");
        person.setZip(scanner.nextLine());
        System.out.println("phone number");
        person.setPhone_number(scanner.nextLine());
        System.out.println("email");
        person.setEmail(scanner.nextLine());
        contacts.add(person);
    }
    public void edit(String first_name, String last_name, Person person) {
        String editS = scanner.nextLine();
        System.out.println("Enter First Name");
        String editNa = scanner.nextLine();
        System.out.println("Enter Last Name");
        String editLa = scanner.nextLine();
        System.out.println("Enter City");
        String editCi = scanner.nextLine();
        System.out.println("Enter State");
        String editSt = scanner.nextLine();
        System.out.println("Enter Pin Code");
        String editPi = scanner.nextLine();
        System.out.println("Enter Phone Number");
        String editMo = scanner.nextLine();
        System.out.println("Enter Email");
        String editEm = scanner.nextLine();
        int flag = 0;
        for (Person contact : contacts) {
            if (contact.getFirst_name().equalsIgnoreCase(first_name) && contact.getLast_name().equalsIgnoreCase(last_name)) {
                flag = 1;
                contact.setFirst_name(person.getFirst_name());
                contact.setLast_name(person.getLast_name());
                contact.setCity(person.getCity());
                contact.setState(person.getState());
                contact.setZip(person.getZip());
                contact.setPhone_number(person.getPhone_number());
                contact.setEmail(person.getEmail());
                break;
            }
        }
        if(flag == 1)
            System.out.println("Contact updated successfully");
        else
            System.out.println("Contact Not found");
    }


    @Override
    public void display(){
        for(int i = 0; i < contacts.size(); i++)
        System.out.println(contacts.get(0).toString()); // System.out.println(contacts.get(i));
    }

    @Override
    public void delete(String first_name, String last_name) {
        for (int i=0; i<contacts.size(); i++) {
            if (contacts.get(i).getFirst_name().equals(first_name)) {
                contacts.remove(i);
                System.out.println("Delete Successfully");
            }
            System.out.println("no record found");
            }

        }

    }

