package com.pluralsight;

public class Food {
    //Attributes
    private String name;
    private int calories;
    private boolean isHot;
    private boolean isSpicy;
    private String color;
    private boolean isSweet;
    private double price;

    /* Other ex of derived attribute
    price - price * tax
    Hot and sweet - isHot && isSweet
    Name and color - yellow mango
    public String getSweetFood(){
    if (isSweet)
        return "Sweet" +name;
    }
     */

    public Food(String name, int calories, boolean isHot, boolean isSpicy, String color, boolean isSweet, double price) {
        this.name = name;
        this.calories = calories;
        this.isHot = isHot;
        this.isSpicy = isSpicy;
        this.color = color;
        this.isSweet = isSweet;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public boolean isHot() {
        return isHot;
    }

    public void setHot(boolean hot) {
        this.isHot = hot;
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    public void setSpicy(boolean spicy) {
        isSpicy = spicy;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isSweet() {
        return isSweet;
    }

    public void setSweet(boolean sweet) {
        isSweet = sweet;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", isHot=" + isHot +
                ", isSpicy=" + isSpicy +
                ", color='" + color + '\'' +
                ", isSweet=" + isSweet +
                ", price=" + price +
                '}';
    }

    // Drived getter
    public String getAdjustedName() {
        return "this is a food: " + name;
    }

    public boolean isHotAndSpicy() {
        if (isHot == true && isSpicy == true) {
            return true;
        }
        return false;
    }
}


