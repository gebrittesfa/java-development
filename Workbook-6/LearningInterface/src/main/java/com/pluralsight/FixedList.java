package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    private List<T> items;
    private int maxSize;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        items = new ArrayList<>();
    }

    // Method to add an items to the list
    public boolean add(T item) {
        if (items.size() < maxSize) {
            items.add(item);
            return true;
        } else {
            System.out.println("Cannot add item/List is full. ");
            return false;
        }
    }
    // Method to get all items in the list

    public List<T> getItems() {
        return items;
    }

//    // Method to grt the size of the list
//    public int size() {
//        return items.size();
//    }
//
//    //check is the list full
//    public boolean isFull() {
//        return items.size() == maxSize;
//    }
//    //method to get max size
//
//    public int getMaxSize() {
//        return maxSize;
//    }
//
//    // method to clear the list
//    public void clear() {
//        items.clear();
//    }
//    // Method to remove an item at a specific index
//    public T remove(int index) {
//        if (index >= 0 && index < items.size()) {
//            return items.remove(index);
//        } else {
//            throw new IndexOutOfBoundsException("Index out of range");
//        }
//    }
//
//    // Method to check if the list contains a specific item
//    public boolean contains(T item) {
//        return items.contains(item);
    //}
}
