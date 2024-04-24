package com.pluralsight;

import java.io.*;
import java.util.Scanner;
public class ReadWritePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Nursery Rhyme(goldilock(1), hansel and greatel(2),"+
                "Or mary had a litter lamb(3): \n ");
        String selection = input.nextLine();

        switch(selection){
            case "1": selection = "goldilocks.txt";
                break;
            case "2": selection = "hansel_and_gretel.txt";
                break;
            case "3": selection = "mary_had_a_little_lamb.txt" ;
                break;
            default:
                System.out.println("Please choose a number");
                break;
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader(selection));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output" + selection));
            String line;
            int lineCount = 1;
            while ((line = reader.readLine()) != null) {
                writer.write(line + "\n");
            }
            reader.close();
            writer.close();
        } catch (Exception e) {
            System.out.println("Error found "+ e.getMessage());
            e.printStackTrace();
        }
    }
}
