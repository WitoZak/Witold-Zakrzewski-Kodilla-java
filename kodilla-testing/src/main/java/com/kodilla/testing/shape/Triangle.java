package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private double side;
    private double high;

    public Triangle(double side, double high) {
        this.side = side;
        this.high = high;
    }

    public String getShapeName() {

        return "Triangle";
    }

    public double getField() {

       return (side * high)/2;
    }
}