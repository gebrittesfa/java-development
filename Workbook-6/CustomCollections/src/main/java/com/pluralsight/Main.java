package com.pluralsight;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        FixedList<Integer> numbers = new FixedList<>(4);
        numbers.add(10);
        numbers.add(3);
        numbers.add(92);
        //numbers.add(43); // this line should fail
        boolean addResult = numbers.add(43);
        System.out.println("Add result for 43: " + addResult);
        System.out.println("Size of number list: " + numbers.getItems().size());

        // Printing the items in the numbers list
        System.out.println("Items in numbers list: " + numbers.getItems());

        // Testing with LocalDate type
        FixedList<LocalDate> dates = new FixedList<>(3);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now().plusDays(1));
        addResult = dates.add(LocalDate.now().plusDays(2));//this should print out false
        System.out.println("Add result for a additional date: " + addResult);
        System.out.println("Size of dates list: " + dates.getItems().size());

        System.out.println("Items in dates list: " + dates.getItems());
        //dates.add(15); // this line should fail
    }
}