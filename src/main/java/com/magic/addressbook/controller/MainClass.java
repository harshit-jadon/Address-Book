package com.magic.addressbook.controller;

import java.util.List;
import java.util.Scanner;

import com.magic.addressbook.entity.Person;
import com.magic.addressbook.services.*;

public class MainClass {
//    public static void main(String[] args){
    public void options(List<Person> contacts){
        System.out.println("Welcome to Address Book");
        Scanner scanner = new Scanner(System.in);
        Ioptions options = new Options();

        char response;
        do{
            System.out.println("PRESS A (FOR ADD CONTACT)");
            System.out.println("PRESS U (FOR UPDATE CONTACT)");
            System.out.println("PRESS D (FOR DISPLAY CONTACT)");
            System.out.println("PRESS X (FOR DELETE CONTACT)");
            System.out.println("PRESS E (FOR EXIT CONTACT)");

             response = scanner.nextLine().charAt(0);
            switch(response){
                case 'A':
                    options.addcontact(contacts);
                    options.display(contacts);
                    break;
                case 'U' :
                    System.out.println("Enter first name");
                    String editNa1 = scanner.nextLine();
                    System.out.println("Enter last name");
                    String editNa2 = scanner.nextLine();
                    options.edit(editNa1, editNa2,contacts);

                            break;
                case 'D':
                    options.display(contacts);
                    break;
                case 'X':
                    System.out.println("enter first name");
                    String deleteN = scanner.nextLine();
                    System.out.println("Enter Last Name");
                    String deleteL = scanner.nextLine();
                    options.delete(deleteN, deleteL,contacts );

                    break;
                default:

                    break;
            }
        }while(response!='E');
    }
}