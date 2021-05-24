package com.magic.addressbook.controller;
import com.magic.addressbook.entity.Person;
import com.magic.addressbook.services.Options;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        Scanner scanner = new Scanner(System.in);
        Options options = new Options();
        System.out.println("PRESS U (FOR NEW CONTACT)");
        System.out.println("PRESS E (FOR EDIT CONTACT)");
        System.out.println("PRESS D (FOR DELETE CONTACT)");
        char response = scanner.nextLine().charAt(0);

//            if (response == 'U') {
//                options.update();
//
//            } else if (response == 'E') {
//                System.out.println("Enter Name");
//                Scanner sc1 = new Scanner(System.in);
//                String name = sc1.nextLine();
//                options.edit(name);
//
//            } else if (response == 'D') {
//                System.out.println("Enter Name");
//                Scanner sc1 = new Scanner(System.in);
//                String name = sc1.nextLine();
//                options.delete(name);
//
//            } else {
//                System.out.println("you enter wrong keyword");
//            }
        while((response !='U') && (response !='E') && (response !='D')){
            System.out.println("Invalid choice!. Enter correct option 'U' , 'E', 'D' " );


            response = scanner.nextLine().charAt(0);
        }
        switch(response) {
            case 'U':
                options.update();
                break;

            case 'E':

            case 'D':
                break;

            default:
        }
    }

}
