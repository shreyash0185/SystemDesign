package Concept.SOLID.afterOpenCloase;

public class Circle implements Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return 0;
    }
}
