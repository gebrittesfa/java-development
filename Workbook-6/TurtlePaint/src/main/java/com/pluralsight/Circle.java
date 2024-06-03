package com.pluralsight;

public class Circle extends Shape{
    private int radius;

    Circle(int x, int y, String color ,int border, int width, int height,int radius){
        super(x,y,color ,border, width,height);
        this.radius=radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    // @Override
    public void paint(){
        System.out.println("Painting a circle at (" + super.x + ", " + super.y + ") " +
                "with border color " + super.border + " and radius " + this.radius);

    }
}
