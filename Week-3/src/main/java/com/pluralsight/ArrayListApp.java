package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListApp {
    public static void main(String[] args) {
        ArrayList<String> classYearUp = new ArrayList<String>();
        classYearUp.add("Gebrit Tesfay");
        classYearUp.add("Onriel Houston");
        classYearUp.add("Charles Putney");
        classYearUp.add("Emily Trifone");
        //System.out.println(classYearUp);
        classYearUp.add("Noel Guillen");
        classYearUp.add("Tina Nguyen");
        for (int i = 0; i < classYearUp.size(); i++) {
            System.out.println((i + 1) + " : " + classYearUp.get(i));

        }
        classYearUp.set(2, "May Trifone");
        classYearUp.remove(0);
        System.out.println(classYearUp);
        Collections.sort(classYearUp);
        classYearUp.clear();
        System.out.println(classYearUp);


    }

}

   // public ArrayList<String> getSearchInventory() {

    //}
//}
