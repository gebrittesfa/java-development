package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    public Person(String id, String firstName, String lastName, LocalDate birthDate,
                  LocalTime hireDate, String department) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;

    }

    public Person(String id, String firstName, String lastName, LocalDate birthDate, int creditRateing) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;

    }

}
