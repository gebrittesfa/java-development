package com.pluralsight;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProductDriver {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Product> inventoryOfProducts = new ArrayList<Product>();

        System.out.println("Welcome to my Product Shop!");
        int command;
        System.out.println("1. - Display all products ");
        System.out.println("2. - Display cart ");
        System.out.println("3. - Exit the home screen");

        command = in.nextInt();
        while (command != 4) {
            switch (command) {
                case 1:
                    displayProducts(inventoryOfProducts);
                    break;
                case 2:
                    displayCart(inventoryOfProducts);
                    break;
                case 3: addProducts(inventoryOfProducts);
                    break;
                case 4:
                    System.out.println("Welcome to my Product Shop!");
                    System.out.println("1. - Display all products ");
                    System.out.println("2. - Display cart ");
                    //System.out.println("3 - Remove flower ");
                    System.out.println("3. - Exit the home screen");


                    break;
            }
            System.out.println("Enter another command:");
            command = in.nextInt();
            in.nextLine();
        }
    }

    private static void addProducts(ArrayList<Product> inventoryOfProducts) {
        System.out.println("What product do you want on add?");
        String name = in.nextLine();
        for (Product product : inventoryOfProducts) {
            System.out.println(product);
        }

    }

    private static void displayCart(ArrayList<Product> product) {
        System.out.println("Items in the cart");
        if (!product.isEmpty()){
            System.out.println("Cart is empty");
        } else {
            for (Product inventory : product){
                System.out.println(product);
            }
        }

        /*
        System.out.println("What is the product Sku? ");
        int sku = in.nextInt();
        in.nextLine();
        System.out.println("What product do you want on the Cart?");
        String name = in.nextLine();
        System.out.println("What is the price of the product?");
        double price = in.nextDouble();
        System.out.println("What is the department of the product?");
        String department = in.nextLine();
        //Products products1 = new Products(sku, name, price, department);
        products.add(getInventoryOfProducts();
        for (Products product : products) {
            System.out.println(products);
        }

         */

    }

    private static void displayProducts(ArrayList<Product> product) {
        for (Product products : product) {
            System.out.println(product);

        }

        }
    private static void exitApplication(){
        System.out.println("Thank you for shopping!");
        System.exit(0);
    }

    public static ArrayList<Product> getInventoryOfProducts() {
        ArrayList<Product> inventory = new ArrayList<Product>();
        try {
            FileReader fileReader = new FileReader("products.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            //bufferedReader.lines();
            String line;//to store our lines
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split("\\|");
                Product product = new Product(data[0], data[1]
                        ,Double.parseDouble(data[2]),data[3]);
                inventory.add(product);//then we add the product to the arraylist
                //  br.close();
            }

        } catch (IOException e){
            //System.out.println("Please try again");
            e.printStackTrace();
        }

        return inventory;
    }
}

