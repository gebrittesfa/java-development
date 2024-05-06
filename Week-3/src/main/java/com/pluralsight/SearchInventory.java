package com.pluralsight;
/*
This object called out the class pDrive
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchInventory {
    public static void main(String[] args) {
        ArrayList<pDriver> searchInventory = new ArrayList<pDriver>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("We carry the following inventory: ");
        searchInventory.add(new pDriver(0, "Cell Phone", 999.99f));
        searchInventory.add(new pDriver(1, "Soap", 3.56f));
        searchInventory.add(new pDriver(2, "Body Wash", 5.30f));
        searchInventory.add(new pDriver(3, "Hair Oil", 7.90f));
        searchInventory.add(new pDriver(4, "Head Shampoo", 10.56f));
        searchInventory.add(new pDriver(5, "Brush", 3.30f));


        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < searchInventory.size(); i++) {
            pDriver p = searchInventory.get(i);
            System.out.printf("Id: %d %s -Price: $%.2f\n",
                    p.getId(), p.getName(), p.getPrice());

        }
    }
    /*
    public static ArrayList<Product> getInventory() {
        ArrayList<Product> searchInventory = new ArrayList<Product>();
        //This method loads product object into inventory
        // and its details are not shows
        Product product1 = new Product(1, "Soap", 3.56f);
        Product product2 = new Product(2, "Body Wash", 5.30f);
        Product product3 = new Product(3, "Hair Oil", 7.90f);
        Product product4 = new Product(4, "Head Shampoo", 10.56f);
        Product product5 = new Product(5, "Brush", 3.30f);
        searchInventory.add(product1);
        searchInventory.add(product2);
        searchInventory.add(product3);
        searchInventory.add(product4);
        searchInventory.add(product5);
        System.out.println(product1);
        return searchInventory;

     */

    //BONUS
   public static ArrayList<pDriver> getInventory() {
       ArrayList<pDriver> searchInventory = new ArrayList<pDriver>();
       //This method loads product object into inventory
       // and its details are not shows
       // String product;

       /*Because we are coparing the starting, we need to make sure we do not go out of bounds
       invenroty[i] comparing to inventory [i+1]
        outer for loop goes from inventory[0] to inventory[6]
        inner for loop goes from inventory[1] to inventory[7]
        we will compare inventory [0] (first item) to the inventory

        */
       /*
       ArrayList<Product> searchInventory = getInventory();
       for (int i = 0; i < searchInventory.size()-1; i++){
           //sorting by name of products:
           for (int j = i + 1; i < searchInventory.size(); i++){

               //Campare to method

               if (searchInventory.get(i).getName().compareTo(searchInventory.get(j).getName()>0){
                   Product temp = searchInventory.get(i);//save the first object in temp value
                   searchInventory.set(i, searchInventory.get(j));//sava the 2nd in placeof the 1st
                   searchInventory.set(j, temp);//save the 2nd as temp(valueof the 1st)
               }
           }
           */


           try {
           // Open the file for reading
           FileReader fileReader = new FileReader("inventory.csv");
           BufferedReader reader = new BufferedReader(fileReader);
           //BufferedWriter writer = new BufferedWriter(new FileWriter(String.valueOf(fileReader)));
           //reader.readLine(); //it will read and skip the first line
           String line;

           // Read each line of the file
           while ((line = reader.readLine()) != null) { // Starts on second line
               String[] data = line.split("\\|");
               pDriver product1 = new pDriver(Integer.parseInt(data[0]),
                       data[1], Float.parseFloat(data[2]));
               //Double.parseDouble(data[3]));
               //System.out.printf("%d %s %.2f\n", employee.getEmployeeId(),
               //  employee.getName());
               searchInventory.add(product1);//then we add the product to the arrayList
               reader.close();
           }

       } catch (IOException e) {
           //System.out.println("An error occurred while reading the file.");
           e.printStackTrace();
       }

       return searchInventory;

   }
}


