/*
package com.pluralsight;

import java.util.InputMismatchException;
import java.util.Scanner;
public class FamousQuotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] quotes;
        int number;
        quotes = new String[10];
        while (quotes.equals("yes")) {

            try {
                // Adding 10 favorite quotes
                quotes[0] = "The only way to do great work is to love what you do. - Steve Jobs";
                quotes[1] = "In the end, it's not the years in your life that count. It's the life in your years. - Abraham Lincoln";
                quotes[2] = "The greatest glory in living lies not in never falling, but in rising every time we fall. - Nelson Mandela";
                quotes[3] = "Life is what happens when you're busy making other plans. - John Lennon";
                quotes[4] = "Believe you can and you're halfway there. - Theodore Roosevelt";
                quotes[5] = "The future belongs to those who believe in the beauty of their dreams. - Eleanor Roosevelt";
                quotes[6] = "You miss 100% of the shots you don't take. - Wayne Gretzky";
                quotes[7] = "Success is not final, failure is not fatal: It is the courage to continue that counts. - Winston Churchill";
                quotes[8] = "I have not failed. I've just found 10,000 ways that won't work. - Thomas A. Edison";
                quotes[9] = "You must be the change you wish to see in the world. - Mahatma Gandhi";

                //Prompt user to select a number that exists
                System.out.print("Enter a number between 1 and 10 to display the quote.");
                number = scanner.nextInt();
                System.out.println("your quote is " + quotes[number - 1]);
                quotes = in.next();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a DIGIT");
                in.nextLine();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("The number shouldd be between 1 and 10");
                number = in.nextInt();
            }
        }
    }
}

 */