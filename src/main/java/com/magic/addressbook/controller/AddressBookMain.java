package com.magic.addressbook.controller;
import com.magic.addressbook.services.*;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        IaddressBook iaddressbook = new AddressBook();
        char response;
        do{
            System.out.println("PRESS A (for ADD New Address Book)");
            System.out.println("PRESS O (for OPEN Address Book)");
            System.out.println("PRESS S (for SHOW All Address Book)");
            System.out.println("PRESS F (for Search Person from City");
            System.out.println("Press P (for See the number of Persons in a Particular City");
            System.out.println("PRESS E (for EXIT Address Book)");
            response = scanner.nextLine().charAt(0);
            switch (response){
                case 'A':
                    String name = scanner.nextLine();
                    System.out.println("Enter Address Book Name");
                    String addressBookName = scanner.nextLine();
                    iaddressbook.newAddressBook(addressBookName);

                    break;
                case 'O':
                    String open = scanner.nextLine();
                    System.out.println("These Address Books are available");
                    System.out.println("Enter name of Address Book");
                    String abname = scanner.nextLine();
                    iaddressbook.openAddressbook(abname);

                    break;
                case 'S':
                    iaddressbook.showAllAddressBook();
                    break;
                case 'F':
                    String find = scanner.nextLine();
                    System.out.println("Enter City name");
                    String city = scanner.nextLine();
                    iaddressbook.showPersonCity(city);
                    break;
                case 'P':
                    System.out.println("Enter City");
                    String countInCity = scanner.nextLine();
                    iaddressbook.showCountInCity(countInCity);

                        break;

                default:
                    break;

            }
        }while(response!='E');
    }

}
;
