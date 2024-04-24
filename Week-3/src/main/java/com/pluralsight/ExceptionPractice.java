package com.pluralsight;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
this class will show to utilize exception handling for runtime
 */

public class ExceptionPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        System.out.println("Pleas enter a number ");
        num1=sc.nextDouble();
    //}//catch(InputMismatchException ime) {
        System.out.println("You did not enter a number");
    }
}
