//package com.pluralsight;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        DataManager dataManager = new DataManager();
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter actor name to search: ");
//        String actorName = scanner.nextLine();
//        ArrayList<Actor> actors = dataManager.searchActorsByName(actorName);
//        if (actors.isEmpty()) {
//            System.out.println("No actors found with the name: " + actorName);
//        } else {
//            System.out.println("Actors found:");
//            actors.forEach(System.out::println);
//        }
//        System.out.print("Enter actor ID to get their films: ");
//        int actorId = scanner.nextInt();
//        ArrayList<Film> films = dataManager.getFilmsByActorId(actorId);
//        if (films.isEmpty()) {
//            System.out.println("No films found for actor ID: " + actorId);
//        } else {
//            System.out.println("Films found:");
//            films.forEach(System.out::println);
//        } scanner.close();
//    }
//}
//
