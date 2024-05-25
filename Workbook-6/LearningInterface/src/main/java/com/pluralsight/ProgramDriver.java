package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//package com.pluralsight.streams;
public class ProgramDriver {

    public static void main(String[] args) {
        // Create a list of at least 10 people
        Person person1 = new Person("Gebrit", "Tesfay",25);
        Person person2 = new Person("John", "Doe", 30);
        Person person3 = new Person("Jane", "Doe", 25);
        Person person4 = new Person("Michael", "Smith", 40);
        Person person5 = new Person("Mary", "Johnson", 35);
        Person person6 = new Person("William", "Brown", 50);
        Person person7 = new Person("Patricia", "Jones", 45);
        Person person8 = new Person("Robert", "Davis", 60);
        Person person9 = new Person("Linda", "Garcia", 55);
        Person person10 = new Person("David", "Martinez", 28);
        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        persons.add(person7);
        persons.add(person8);
        persons.add(person9);
        persons.add(person10);

        // Prompt the user for a name to search (first or last)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name to search (first or last): ");
        String searchName = scanner.nextLine();


        // Create a new list of people whose name was a match
        List<Person> matchingPeople = new ArrayList<>();
        for (Person person : persons) {
            if (person.getFirstName().equals(searchName) ||
                    person.getLastName().equals(searchName)) ;
        }
        //matchingPeople.add(person); ///re-run it
        // Display the names of the people in the matching list
        if (matchingPeople.isEmpty()) {
            System.out.println("No matches found.");
        } else {
            System.out.println("Matching people:");
            for (Person person : matchingPeople) {
                System.out.println(person);
            }
        }
        //Calculate the average age of all people in the original list
        int totalAge = 0;
        int oldestAge = Integer.MIN_VALUE;
        int youngestAge = Integer.MAX_VALUE;

        for (Person person : persons) {
            int age = person.getAge();
            totalAge += age;
            if (age > oldestAge) {
                oldestAge = age;
            }
            if (age < youngestAge) {
                youngestAge = age;
            }
        }
        double averageAge = totalAge/persons.size();
        System.out.println("Average age: " + averageAge);
        System.out.println("Oldest age: " + oldestAge);
        System.out.println("Youngest age: " + youngestAge);
    }


}