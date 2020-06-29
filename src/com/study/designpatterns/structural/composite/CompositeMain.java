package com.study.designpatterns.structural.composite;

public class CompositeMain {
    public static void main(String[] args) {
        Shape shapeCircle = new Circle();
        Shape shapeTriangle = new Triangle();
        Shape shapeSquare = new Square();

        Drawing drawing = new Drawing();

        drawing.add(shapeCircle);
        drawing.add(shapeTriangle);
        drawing.add(shapeSquare);
        drawing.draw();

        drawing.remove(shapeSquare);
        drawing.clear();

        drawing.draw();
        drawing.add(shapeCircle);
        drawing.draw();
    }

    /**
     * Where you need to define specific functionality as as entire unit composite different aspects of function in one unit
     * java awt container is example of Composite Pattern
     */
}
