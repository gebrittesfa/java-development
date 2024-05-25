package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Canvas {
    int width;
    int height;
    List<Shape> shapes;

    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
        shapes = new ArrayList<>();
    }
    public void paintCanvas(){
        System.out.println("Canvas size: " + width +"x"+ height);
        for (Shape shape : shapes){
            shape.paint();
        }
    }
}
