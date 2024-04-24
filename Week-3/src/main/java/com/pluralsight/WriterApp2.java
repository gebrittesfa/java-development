package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterApp2 {
    public static void main(String[] args) {
        try{
            FileWriter fileWriter = new FileWriter("text.txt");
            //Create a BufferWriter
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            //Write to the file
            String text;
            for(int i=1; i<=10; i++) {
                text = String.format("Counting %d\n", i);
                bufferedWriter.write(text);
            }
            // close the writer
            bufferedWriter.close();

        } catch (IOException e){
            System.out.println("ERROR: An unexpected error occurred");

        }
    }
}
