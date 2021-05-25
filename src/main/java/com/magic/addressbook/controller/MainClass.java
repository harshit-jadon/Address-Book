

package com.magic.addressbook.controller;
import com.magic.addressbook.entity.Person;
import com.magic.addressbook.services.*;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args){
        System.out.println("Welcome to Address Book");
        Scanner scanner = new Scanner(System.in);
        Ioptions options = new Options();
        System.out.println("PRESS A (FOR ADD CONTACT)");
        System.out.println("PRESS E (FOR EDIT CONTACT)");
        System.out.println("PRESS D (FOR DISPLAY CONTACT)");
        System.out.println("PRESS X (FOR DELETE CONTACT)");
        int exit =0;
        char response = scanner.nextLine().charAt(0);
        while((response !='A') && (response !='E') && (response !='D') && (response !='X')) {
            System.out.println("Invalid choice!. Enter correct option 'A' , 'E', 'D', 'X' ");
            response = scanner.nextLine().charAt(0);
//            while(exit==0){}
            switch(response) {
                case 'A':
                    options.addcontact();
                    options.display();
                    break;

                case 'E':
                    break;

                case 'D':
                    options.display();
                    break;

                case 'X':
                    break;

                default:
                    exit = 1;
            }

        }
    }
}





