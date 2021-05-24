package com.magic.addressbook.services;
import com.magic.addressbook.entity.Person;
import java.util.*;
public class Options implements Ioptions, Optionss {
    Person person = new Person();
    ArrayList<Person> people = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void update() {
        System.out.println("first name");
        String first_name = scanner.nextLine();

        System.out.println("last name");
        String last_name = scanner.nextLine();

        System.out.println("address");
        String address = scanner.nextLine();

        System.out.println("city");
        String city = scanner.nextLine();

        System.out.println("state");
        String state = scanner.nextLine();

        System.out.println("zip");
        String zip = scanner.nextLine();

        System.out.println("phone number");
        String phone_number = scanner.nextLine();

        System.out.println("email");
        String email = scanner.nextLine();

    }

    @Override
    public void edit() {


    }

    @Override
    public void delete() {

    }

}
