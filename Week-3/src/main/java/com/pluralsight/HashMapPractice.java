package com.pluralsight;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        //Create a hashMap thatholds names and yor id
        HashMap<Integer, String> students = new HashMap<Integer, String>();
        //call the put method to add elements:
        students.put(1, "Onriel Houston");
        students.put(2, "Gebrit Tesfay");
        students.put(3, "Semere Teklemariam");
        students.put(4, "Delina Teklemariam");
        System.out.println(students);

        HashMap<String, String> statesAndCapitals = new HashMap<String, String>();
        statesAndCapitals.put("CT", "Hartford");
        statesAndCapitals.put("CA", "Sacramento");
        statesAndCapitals.put("TX", "Austin");
        System.out.println(statesAndCapitals);

        Scanner scanner = new Scanner(System.in);
        System.out.println("What capital do you want?");
        String state = scanner.nextLine();

        String capital = statesAndCapitals.get(state);

        if(capital != null){
            System.out.println(capital);
        }else {
            System.out.println("Such capital doesn't exist");
        statesAndCapitals.remove("TX");

        }
    }
}
