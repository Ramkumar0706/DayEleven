package javaSOLIDPrincple.OCP;

public class Circle implements Shape {
     double radius;

   

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
