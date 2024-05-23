package com.pluralsight;

public interface Movable {
    void move(int xUnits, int yUnits);
    void goHome();
    default void print(){
        System.out.println("I can move!");
    }
}
