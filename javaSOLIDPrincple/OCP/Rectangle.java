package javaSOLIDPrincple.OCP;

public class Rectangle implements Shape {
     double width;
     double height;

    // Constructor, getters and setters

    @Override
    public double calculateArea() {
        return width * height;
    }
}