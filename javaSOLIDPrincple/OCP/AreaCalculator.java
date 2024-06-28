package javaSOLIDPrincple.OCP;

public class AreaCalculator {
    public double calculateRectangleArea(Rectangle rectangle) {
        return rectangle.width * rectangle.height;
    }

    public double calculateCircleArea(Circle circle) {
        return Math.PI * Math.pow(circle.radius, 2);
    }
}
