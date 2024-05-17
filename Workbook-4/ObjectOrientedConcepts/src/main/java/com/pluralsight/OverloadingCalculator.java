package com.pluralsight;

public class OverloadingCalculator {
    /*
    for overloading to work the METHOD
     */
    public void sum ( int a, int b){
        System.out.println(a + b);
    }

    public void sum (double a, double b){
        System.out.println(a + b);
    }
    public void sum(int a, int b, int c){
        System.out.println(a + b + c);
    }
}
