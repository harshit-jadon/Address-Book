package com.magic.addressbook.services;
import com.magic.addressbook.entity.Person;

import java.util.*;
public class Options implements Ioptions {


//    ArrayList<Person> contacts = new ArrayList<Person>()
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addcontact(List<Person> contacts) {
        Person person = new Person();
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
        int flag = 0;
        String first_name = person.getFirst_name();
        String last_name = person.getLast_name();
        for (Person contact : contacts) {
            if (contact.getFirst_name().equalsIgnoreCase(first_name) && contact.getLast_name().equalsIgnoreCase(last_name)){
                flag=1;
                break;
            }
        }
        if(flag==1) System.out.println("Person already existed");
        else{
            contacts.add(person);
        }

    }
    @Override
    public void edit(String first_name, String last_name,List<Person> contacts) {
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
                contact.setFirst_name(editNa);
                contact.setLast_name(editLa);
                contact.setCity(editCi);
                contact.setState(editSt);
                contact.setZip(editPi);
                contact.setPhone_number(editMo);
                contact.setEmail(editEm);
                break;
            }
        }
        if(flag == 1)
            System.out.println("Contact updated successfully");
        else
            System.out.println("Contact Not found");
    }


    @Override
    public void display(List<Person> contacts){
        for(int i = 0; i < contacts.size(); i++)
        System.out.println(contacts.get(0).toString());
    }

    @Override
    public void delete(String deleteN, String deleteL,List<Person> contacts) {
        int flag = 0;
        for (Person contact : contacts) {
            if (contact.getFirst_name().equalsIgnoreCase(deleteN) && contact.getLast_name().equalsIgnoreCase(deleteL)) {
                flag = 1;
                contacts.remove(contact);
                break;
            }
        }
        if(flag == 1)
            System.out.println("Contact deleted successfully");
        else
            System.out.println("Contact Not found");

        }

    }

