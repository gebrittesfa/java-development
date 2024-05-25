package com.pluralsight;

public class Triangle extends Shape{
    String background;

    public Triangle(int x, int y, String color, int border, int width, int height, String background) {
        super(x, y, color, border, width, height);
        this.background=background;
    }

    @Override
    public void paint() {
        System.out.println("Painting a triangle at (" + this.background + " and size "
                + super.width +"and height " + super.height);

    }
}
