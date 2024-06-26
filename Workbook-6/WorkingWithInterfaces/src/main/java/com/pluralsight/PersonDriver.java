package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonDriver {
    public static void main(String[] args) {
        // create a list of person object
        List<Person> myFamily = new ArrayList<Person>();
        myFamily.add( new Person("Dana", "Wyatt", 63) );
        myFamily.add( new Person("Zachary", "Westly", 31) );
        myFamily.add( new Person("Elisha", "Aslan", 14) );
        myFamily.add( new Person("Ian", "Auston", 16) );
        myFamily.add( new Person("Zephaniah", "Aiden", 9) );
        myFamily.add( new Person("Ezra", "Aiden", 17) );
        Collections.sort(myFamily);
        for (Person p: myFamily){
            System.out.println(p.getLastName() +" "+p.getFirstName());
        }
    }
}
