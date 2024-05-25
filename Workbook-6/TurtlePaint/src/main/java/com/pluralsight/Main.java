package com.pluralsight;

import java.util.Scanner;

public class Main {
    private static Canvas canvas;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Initialize the canvas
        System.out.println("Enter canvas width: ");
        int canvasWidth = scanner.nextInt();
        System.out.println("Enter canvas height: ");
        int canvasHeight = scanner.nextInt();
        canvas = new Canvas(canvasWidth, canvasHeight);

        while (true) {
            System.out.println("Home Screen");
            System.out.println("1) Add Shape");
            System.out.println("2) Save Image");
            System.out.println("0) Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addShape(scanner);
                    break;
                case 2:
                    saveImage();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addShape(Scanner scanner) {
        System.out.println("Which shape? (1. Square 2. Circle 3. Triangle)");
        int shapeType = scanner.nextInt();

        System.out.println("Enter the border width: ");
        String borderWidth = scanner.next();

        System.out.println("Enter the border color: ");
        String borderColor = scanner.next();

        System.out.println("Enter the location of the shape (X or Y): ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        switch (shapeType) {
            case 1:
                System.out.println("Enter the size of the square: ");
                //int x = scanner.nextInt();
                Square square = new Square(1, 2, "White" ,3,4,5);

                square.paint();

                try{
                    saveImage();
                }catch (Exception e){
                    System.out.println(e);
                }

                break;
            case 2:
                System.out.println("Enter the radius of the circle: ");
                int radius = scanner.nextInt();
                System.out.println("Enter the X: ");
                int x = scanner.nextInt();
                System.out.println("Enter the y: ");
                int y = scanner.nextInt();
                System.out.println("Enter the color: ");
                String color = scanner.next();
                System.out.println("Enter the border: ");
                int border = scanner.nextInt();
                System.out.println("Enter the width: ");
                int width = scanner.nextInt();
                System.out.println("Enter the height: ");
                int height = scanner.nextInt();
                Circle circle = new Circle(x, y, color ,border, width, height,radius);
                circle.paint();

                try{
                    saveImage();
                }catch (Exception e){
                    System.out.println(e);
                }
                break;
            case 3:
                System.out.println("Enter the width and height of the triangle: ");
                int widthBorder = scanner.nextInt();
                System.out.println("Enter the height: ");
                int heightBorder = scanner.nextInt();
                System.out.println("Enter the background");
                String background = scanner.next();
                Triangle triangle = new Triangle(x, y, background);
                triangle.paint();

                try{
                    saveImage();
                }catch (Exception e){
                    System.out.println(e);
                }

                break;
            default:
                System.out.println("Invalid shape type.");
                return;
        }

       // canvas.addShape(shape);
        canvas.paintCanvas();
    }

    private static void saveImage() {
        // Simulating saving image, in a real application you would save the state of canvas or its visual representation.
        System.out.println("Image saved (simulation).");
    }




   //}
}
