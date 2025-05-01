package Concept.SOLID.openClosePrinciple;

public class ShapeCircle {
    double radius;

    public ShapeCircle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
