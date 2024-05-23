package com.pluralsight;

public class Pair <T extends Number> {
    // A pair contains two objects
    private T leftThing;
    private T rightThing;

    Pair(T leftThing, T rightThing) {
        this.leftThing = leftThing;
        this.rightThing = rightThing;
    }

    public T getLeftThing()  {
        return this.leftThing;
    }

    public T getRightThing()  {
        return this.rightThing;
    }

    public void swap()  {
        T temp = leftThing;
        rightThing = leftThing;
        leftThing = rightThing;
    }

}
