package com.kodilla.testing.shape;

class Square implements Shape {

    private double length;
    public Square(double a) {
        this.length = a;
    }

    public String getShapeName() {
        return "Square";
    }

    public double getField() {
        return length * length;
    }
}
