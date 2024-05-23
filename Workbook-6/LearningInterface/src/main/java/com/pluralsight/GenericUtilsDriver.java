package com.pluralsight;

import java.util.ArrayList;

public class GenericUtilsDriver {
    public static void main(String[] args) {
        // Test the removeDuplicates method
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(4);
        intList.add(5);
/*
ArrayList<String> words = new ArrayList<>();
        words.add("Bat");
        words.add("Bull");
        words.add("Bull");
        words.add("Cat");
        words.add("Bat");

        System.out.println(GenericUtils.removeDuplicates(words));
 */
        System.out.println(GenericUtils.removeDuplicates(intList));
        System.out.println("Original List: " + intList);
        ArrayList<Integer> distinctIntList = (intList);
        System.out.println("Distinct List: " + distinctIntList);

        // Test the mergeAlternating method
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        ArrayList<String> strList = new ArrayList<>();
        strList.add("Apple");
        strList.add("Banana");

        System.out.println("Original List: " + strList);
        //ArrayList<String> reversedStrList = reversedStrList(strList);
        //System.out.println("Original List: " + reversedStrList);


    }
}
