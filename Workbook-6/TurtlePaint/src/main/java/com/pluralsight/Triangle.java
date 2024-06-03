package com.pluralsight;

public class Triangle extends Shape{
    String background;
    int width;
    int height;

    public Triangle(int x, int y, String color, int border, int width, int height, String background) {
        super(x, y, color, border, width, height);
        this.background=background;
        this.width = width;
        this.height = height;

    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void paint() {
        System.out.println("Painting a triangle at (" + this.background + " and size "
                + this.width +"and height " + this.height);

    }
}
