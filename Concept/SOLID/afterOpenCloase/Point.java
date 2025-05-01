package Concept.SOLID.afterOpenCloase;

public class Point implements Shape {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public double getArea() {
         throw new UnsupportedOperationException("Point does not have an area");
    }
}
