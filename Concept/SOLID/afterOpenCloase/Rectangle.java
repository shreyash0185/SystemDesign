package Concept.SOLID.afterOpenCloase;

public class Rectangle implements Shape {

    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    @Override
    public double getArea() {
        return length * width;
    }
}
