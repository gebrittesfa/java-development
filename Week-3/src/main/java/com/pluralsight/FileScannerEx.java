/*
package com.pluralsight;

import java.util.Scanner;
import java.io.IOException;

public class FileScannerEx {
    public static void main(String[] args) {

        try
        {
            // create a FileInputStream object pointing to
            // a specific file

            FileScannerEx fis = new FileScannerEx("poem.txt");
            FileScannerEx fis = new FileScannerEx(" ");
            // create a Scanner to reference the file to be read
            Scanner scanner = new Scanner(fis);
            String input; //save each line from our file
            // read until there is no more data
            while(scanner.hasNextLine()) {// while there are more lines to be read
                input = scanner.nextLine();// read each line using nextline methods
                System.out.println(input);
            }
            // close the scanner and release the resources
            scanner.close();
        }
        catch(IOException e) {
            // display stack trace if there was an error
            e.printStackTrace();
    }
}
}

 */
