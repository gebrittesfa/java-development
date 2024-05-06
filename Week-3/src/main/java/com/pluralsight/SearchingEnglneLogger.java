package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SearchingEnglneLogger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a search item or X to exite: ");
        String searchItem = scanner.nextLine();
        while (!searchItem.equalsIgnoreCase("X")) {
            // logActions("Search : "+searchItem);
            System.out.println("Enter a search item or X to exite");
            searchItem = scanner.nextLine();
        }
        if (searchItem.equalsIgnoreCase("X")) {
            logActions();
        }
    }
    public static void logActions(){
        try{
            FileWriter fw = new FileWriter("logs.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
           // bw.write(action+"\n");

            //fw.close();
            bw.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public static String getCurrentDateTime(){
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return dtf.format(ldt);
    }
}
