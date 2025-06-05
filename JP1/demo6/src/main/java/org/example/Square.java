package org.example;

public class Square extends Shape{
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return Math.pow(side,2);
    }

    @Override
    double permiter() {
        return 4*side;
    }
}
