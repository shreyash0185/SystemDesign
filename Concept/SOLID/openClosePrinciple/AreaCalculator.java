package Concept.SOLID.openClosePrinciple;

import java.awt.*;

public class AreaCalculator {
    public double calculateArea(Shape shape) {
        if (shape instanceof ShapeRectange) {
            ShapeRectange rectangle = (ShapeRectange) shape;
            return rectangle.length * rectangle.width;
        } else if (shape instanceof ShapeSquare) {
            ShapeSquare square = (ShapeSquare) shape;
            return square.side * square.side;
        }else if(shape instanceof ShapeCircle) {
            ShapeCircle circle = (ShapeCircle) shape;
            return Math.PI * circle.radius * circle.radius;
        } else {

            throw new UnsupportedOperationException("Shape not supported");
        }

    }
}

//if any shape is added, we need to modify the AreaCalculator class
//As it is not following the open-closed principle, we need to modify the AreaCalculator class
//