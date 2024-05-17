package com.pluralsight;

import java.util.Scanner;

public class CardDriver {
    public static void main(String[] args) {
        /*
        Deck deck = new Deck();
        Hand hand = new Hand();

        //deals 5 card
        for (int i = 0; i<5; i++){
            // get a card from  the deck
            Card card = deck.deal();
            //deal that card to the hand
            hand.deal(card);
        }
        int handValue = hand.getValue();
        System.out.println("The hand is worth"+handValue);

         */
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

        //create two player hand
        Hand player1 = new Hand();
        Hand player2 = new Hand();
        //create the player object
        Player player1 = new Player(name1, hand1);
        Player player2 = new Player(name1, hand1);

//        player1.deal(deck.deal());
//        player1.deal(deck.deal());

//        player2.deal(deck.deal());
//        player2.deal(deck.deal());
        // Deal 2 cards to each player's hand
        //Player player1 = new Player(name1, hand1);
        for (int i = 0; i<2; i++){
            // get a card from  the deck
            Card card = deck.deal();
            //deal that card to the hand
            player2.getHand().deal(card);
        }


        // Display each player's hand
        int handValue1 = player1.getHand().getValue();
        System.out.println(handValue1);
        int handValue2 = player2.getHand().getValue();
        System.out.println(handValue2);


//        System.out.println(player1Hand +"'s hand: "+ player1Hand.getSize()+"cards");
//        System.out.println("Value: "+ player1Hand.getValue());
//
//        System.out.println(player2Hand +"'s hand: "+ player2Hand.getSize()+"cards");
//        System.out.println("Value: "+ player2Hand.getValue());

        // Calculate each player's hand value
//        int handValue1 = player1.getValue();
//        int handValue2 = player2.getValue();


        // Determine the winner based on the highest score without going over 21
        String winner = " ";
        if (handValue1 <= 21 && handValue1 > handValue2){
            System.out.println(player1.getPlayerName()+ "has won!");
        } else if ((handValue2 <= 21) && (handValue2>handValue1)) {
            System.out.println(player2.getPlayerName+ "has won!");
        } else if ((handValue1>21) && (handValue2 < 21)) {
            System.out.println(player2.getPlayerName()+ "has won!");
        } else if (handValue2>21) && (handValue1<21)) {
            System.out.println(player1.getPlayerName()+"has won!");
        } else {
            System.out.println("No winner, All players busted");
        }

        // Declare the winner


    }
}
