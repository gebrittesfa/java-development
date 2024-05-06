package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class StoreApp {
    public static void main(String[] args) {
        ArrayList<pDriver> inventory = new ArrayList<pDriver>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("We carry the following inventory: ");
        inventory.add(new pDriver(3, "Laundry Soap",11.50f));
        System.out.println("We carry the following inventory: ");
            for (int i = 0; i < inventory.size(); i++){
                pDriver p = inventory.get(i);
                System.out.printf("id: %d %s - Price: $%.2f",
                        p.getId(), p.getName(), p.getPrice());
            }

        }
     public static ArrayList<pDriver> getInventory() {
         ArrayList<pDriver> inventory = new ArrayList<pDriver>();
     //This method loads product object into inventory
     // and its details are not shows
            pDriver product = new pDriver(1, "Soap", 3.56f);
            pDriver product2 = new pDriver(2, "Body Wash", 5.30f);
            inventory.add(product);
            inventory.add(product2);
            return inventory;
    }
}

