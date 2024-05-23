package com.pluralsight;

import java.util.ArrayList;
import java.util.HashSet;

public class GenericUtils {
    // Method to merge two lists by alternating their elements
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        // Use a Hashset to filter out duplicate elements
        ArrayList<E> newList = new ArrayList<>();
        for (E element : list){
            if (!newList.contains(element)){

                newList.add(element);
            }
        }

        // Create a new ArrayList from the newList
        return newList;
    }

    // generic method that takes two lists of the same type and merges them into a single list.
    // This method alternates the elements of each list.
    public static <E> ArrayList<E> mergeAlternating(ArrayList<E> list1, ArrayList<E> list2) {
        ArrayList<E> mergeList = new ArrayList<>();
        int size1 = list1.size();
        int size2 = list1.size();
        int maxSize = Math.max(size1, size2);

        for (int i = 0; i < maxSize; i++) {
            if (i < size1) {
                mergeList.add(list1.get(i));
            }
            if (i < size2) {
                mergeList.add(list2.get(i));
            }
        }
        return mergeList;
    }
    public static <E> ArrayList<E> reverseList(ArrayList<E> list) {
        ArrayList<E> newList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            newList.add(list.get(i));
        }
        return newList;
    }

}
