package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ProgramDriver2 {
    public static void main(String[] args) {
        Person person1 = new Person("Ezra","Williams",42);
        Person person2 = new Person("Tina","Nguyen",18);
        Person person3 = new Person("Staphon","Williams",19);
        Person person4 = new Person("Emily  ","Trifone",20);
        Person person5 = new Person("Liam","Bihn-King",21);
        Person person6 = new Person("Onriel","Houston",22);
        Person person7 = new Person("Rashed","Jaafar",23);
        Person person8 = new Person("Williams","Putney",24);
        Person person9 = new Person("Jasmine","Quick",25);
        Person person10 = new Person("Gebrit","Tesfay",26);
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

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a name to search for: ");
        String nameToSearch = scanner.nextLine();

        // Create a new list of people whose name was a match using streams
        List<Person> matchedNames = persons.stream().filter(person ->
                person.getFirstName().equals(nameToSearch) ||
                    person.getLastName().equals(nameToSearch)).
                collect(Collectors.toList());
        matchedNames.forEach(name -> System.out.println(name));
        System.out.println(nameToSearch);


//        for (Person person: matchedNames){
//            System.out.println(person.getFirstName()+" "+person.getLastName());
//        }

        // Calculate the average age of all person in the list using streams
        double averageAge = persons.stream().mapToInt(Person::getAge)
                .average().orElse(0.0);
        System.out.println("Average age of persons: " + averageAge);

        // reduce
        List<Integer> ages = persons.stream()
                .map(Person::getAge).toList();
        int averageAge = ages.stream()
                .reduce(0, Integer::sum)/ages.size();

        // Display the age of the oldest person in the list using streams
        Optional<Integer> oldestAge = persons .stream()
                .map(Person::getAge).max(Integer::compareTo);

        // Display the age of the youngest person in the list using streams
        Optional<Integer> youngestAge = persons .stream()
                .map(Person::getAge).max(Integer::compareTo);

        // Printing oldest and youngest ages
        oldestAge.ifPresent(age -> System.out.println("The Oldest age: " +age));
        youngestAge.ifPresent(age -> System.out.println("The Youngest age: " +age));


    }

}