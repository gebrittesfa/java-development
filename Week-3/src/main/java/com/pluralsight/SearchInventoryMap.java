/*
package com.pluralsight;


import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class SearchInventoryMap {
    public static void main(String[] args) {
        HashMap<String, Product> loadInventory() {
            HashMap<String, Product> product = new HashMap<>() {
                product = loadIn();
                for(Product p : product.values()){
                    System.out.println(p);

                }
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter product name: ");
                String productName = scanner.nextLine();
                String searchAgian = "Yes";
                while (searchAgina.equal)

            }

        }
        HashMap<String, Product> loadInventory() {

            try {
                // Open the file for reading
                FileReader fileReader = new FileReader("inventory.csv");
                BufferedReader reader = new BufferedReader(fileReader);
                String line;

                // Read each line of the file
                while ((line = reader.readLine()) != null) { // Starts on second line
                    String[] data = line.split("\\|");
                    Product product1 = new Product(Integer.parseInt(data[0]),
                            data[1], Float.parseFloat(data[2]));
                    searchInventory.put(product1.getName());//then we add the product to the arrayList
                    reader.close();
                }

            } catch (IOException e) {
                //System.out.println("An error occurred while reading the file.");
                e.printStackTrace();
            }

            return searchInventory;
        }

    }

}

 */
