package Concept.SOLID.openClosePrinciple;

public class ShapeSquare {
    double side;

    public ShapeSquare(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }
}
