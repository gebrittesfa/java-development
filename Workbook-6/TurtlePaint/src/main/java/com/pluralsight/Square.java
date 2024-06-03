package com.pluralsight;

public class Square extends Shape{

    public Square(int x, int y, String color , int border, int width, int height) {
        super(x,y,color ,border, width,height);
    }

//    Square(int x, int y, String color , int border, int width, int height){
//        super(x,y,color ,border, width,height);


//}
    @Override
    public void paint() {
        System.out.println("Painting a square at (" + x + ", " + y + ") with border color "+ color+
                + border + " and size " + width);
    }
}
