package com.study.designpatterns.structural.composite;

import java.util.ArrayList;

public class Drawing implements Shape {

    private ArrayList<Shape> shapeArrayLis = new ArrayList<>();

    @Override
    public void draw() {
        for (Shape shape : shapeArrayLis) {
            shape.draw();
        }
    }

    public void add(Shape shape){
        this.shapeArrayLis.add(shape);
    }

    public void remove(Shape shape){
        this.shapeArrayLis.remove(shape);
    }

    public void clear(){
        this.shapeArrayLis.clear();
    }
}
