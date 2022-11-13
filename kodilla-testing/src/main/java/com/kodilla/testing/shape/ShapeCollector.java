package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapes = new ArrayList<>();

    void addFigure(Shape shape) {
        shapes.add(shape);
    }

    boolean removeFigure(Shape shape) {
        if (shapes.contains(shape)) {
            shapes.remove(shape);
        }
        return true;
    }

    public Shape getFigure(int n) {
        return shapes.get(n);
    }

    void showFigures() {
        for (Shape s : shapes) {
            System.out.println(s.getShapeName());
        }
    }

    public int getSize() {
        return shapes.size();
    }
}

