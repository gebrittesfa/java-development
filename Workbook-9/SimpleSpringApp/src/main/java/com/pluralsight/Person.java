package com.pluralsight;

import java.io.Serializable;

/*
This class is a class that will be used to create Java Beans
- objects: The rules for beans:
1. Implement Serialization
2. Public default parameterless no args
3.
 */

public class Person implements Serializable {
    private String name; //private properties

    //Default constructor -- No pa
    public Person(){}

    // Getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
