package com.pluralsight;

import java.util.Scanner;
public class FullNameParsen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName,middleName, lastName, fullName;
        String nameArray;
        System.out.print("Please enter your name: ");
        fullName = scanner.nextLine();
        fullName = fullName.trim();
        nameArray = fullName.split(regex" ");

        // if thet
        if (nameArray.length==2){
            System.out.print("\nFirst name: ");
            System.out.print("Middle name: ");
            System.out.print("Last name: ");
        }else{
            System.out.print("\nFirst name: ");
            System.out.print("Middle name: ");
            System.out.print("Last name: ");
        }


    }

}
