package com.pluralsight;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class CollectionsOtherEx {
    public static void main(String[] args) {
        ArrayList<Objects> things = new ArrayList<>();
        things.add(new BankAccount("Pam", "1234", 12300));
        things.add(new Gold("Chain", 1500));
        List<String> name = new ArrayList<>();
        List<String> numbers = new LinkedList<>();
        Valuable asset = new House("My house",2023, 2000,3);
    }
}
