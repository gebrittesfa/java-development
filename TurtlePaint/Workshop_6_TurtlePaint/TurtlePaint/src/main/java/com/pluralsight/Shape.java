package com.pluralsight;

public abstract class Shape {
    int x;
    int y;
    int border;
    int width;
    int height;

    String color;


    public Shape(int x, int y, String color ,int border, int width, int height) {
        this.x = x;
        this.y = y;
        this.border = border;
        this.width = width;
        this.height = height;
        this.color=color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                ", border='" + border + '\'' +
                ", color=" + color +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getBorder() {
        return border;
    }

    public void setBorder(int border) {
        this.border = border;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void paint();
}
