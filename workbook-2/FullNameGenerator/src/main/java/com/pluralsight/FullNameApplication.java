package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String firstName, middleName, lastName, stuffix, fullName = "";
        System.out.println("please enter your name ");
        System.out.print("First Name");
        firstName = scanner.nextLine();
        firstName =firstName.trim();
        System.out.print("Middle Name");
        middleName = scanner.nextLine();
        middleName = middleName.trim();
        System.out.print("Last Name");
        lastName = scanner.nextLine();
        lastName = lastName.trim();
        System.out.print("Suffix");
        stuffix = scanner.nextLine();

        if (middleName.isEmpty()){
            fullName = firstName+ " "+lastName;
        }else {
           // fullName = firstName+ " "+middleName+""lastName;
        }
       if (stuffix.isEmpty()){
           fullName = fullName + ", "+stuffix;
       }
       System.out.println("FullName: " +fullName);

    }
}
