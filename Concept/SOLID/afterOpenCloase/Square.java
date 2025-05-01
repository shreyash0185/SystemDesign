package Concept.SOLID.afterOpenCloase;

public class Square implements Shape {

    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
