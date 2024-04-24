package com.pluralsight;

import java.io.FileInputStream;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;
public class BedtimeStories {
    public static void main(String[] args) {

        try {
            //BedtimeStories fis;
            FileInputStream fis;
            Scanner scanner = new Scanner(System.in);
            String input;
            System.out.println("Please enter the file that you want to  read: ");
            input = scanner.nextLine();
                if (input.equalsIgnoreCase("Goldlocks and the three bears")){
                    fis = new FileInputStream("goldilocks.txt");
                } else if (input.equalsIgnoreCase("Hansel and Great")){
                    fis = new FileInputStream("hansel_and_great.txt");
                } else if (input.equalsIgnoreCase("Mary Had a Litter lamp")) {
                    fis = new FileInputStream("mary_had_a_litter_lamp");
                }
           // Scanner scanner =new Scanner(fis);
                while (scanner.hasNextLine()){
                    input = scanner.nextLine();// read each line using nextLine method
                    System.out.println(input);
            }
            while (scanner.hasNextLine()){
                input = scanner.nextLine();// read each line using nextLine method
                System.out.println(input);
            }
                //Close the scanner and release the resources
                scanner.close();

            }catch(IOException e){
            //display stack trace if there was an error
                e.printStackTrace();
            }
    }
}
