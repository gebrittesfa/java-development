package com.pluralsight;

import java.io.FileWriter;
import java.io.IOException;

public class WriteApp1 {
    public static void main(String[] args) {
        try{
            // Open the file : fileWriter
            FileWriter writer = new FileWriter("skills.txt");

            //Write to the file
            writer.write("Skills: \n");
            writer.write("Git, HTML, CSS, Bootstrap: \n");
            writer.write("JavaScript, HTML, CSS, Node.js: \n");
            writer.write("Angule\n");
            writer.write("Java");

            //Close the file when are finshied
            System.out.println();
            writer.close();
        } catch (IOException e){
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();

        }
    }
}
