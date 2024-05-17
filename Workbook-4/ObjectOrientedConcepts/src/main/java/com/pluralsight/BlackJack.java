package com.pluralsight;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        // Prompt the user for player names
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of player 1: ");
        String player1Name = scanner.nextLine();
        System.out.println("Enter the name of player 2: ");
        String player2Name = scanner.nextLine();

        // Create a deck of cards
        Deck deck = new Deck();

        // Shuffle the deck
        deck.shuffle();

        // Deal 2 cards to each player's hand
        Hand player1Hand = new Hand();
        player1Hand.deal(deck.deal());
        player1Hand.deal(deck.deal());

        Hand player2Hand = new Hand();
        player2Hand.deal(deck.deal());
        player2Hand.deal(deck.deal());

        // Display each player's hand
        System.out.println(player1Hand +"'s hand: "+ player1Hand.getSize()+"cards");
        System.out.println("Value: "+ player1Hand.getValue());

        System.out.println(player2Hand +"'s hand: "+ player2Hand.getSize()+"cards");
        System.out.println("Value: "+ player2Hand.getValue());

        // Calculate each player's hand value
        int player1Value = player1Hand.getValue();
        int player2Value = player2Hand.getValue();

        /*
        while loop
         */

        // Determine the winner based on the highest score without going over 21
        String winner = " ";
        if (player1Value > 21 && player2Value > 20){
            winner = "No winner";
        } else if (player1Value > 21) {
            winner = player2Name + " wins";
        } else if (player2Value > 21 ) {
            winner = player1Name + " winse";
        } else if (player1Value > player2Value) {
            winner = player1Name + " wins";
        } else if (player2Value > player1Value) {
            winner = player2Name + " wins";
        } else {
           // winner = " It's a tie";
            System.out.println("No winner, All players busted");
        }

        // Declare the winner
        System.out.println("Winner: " + winner);

    }
}
