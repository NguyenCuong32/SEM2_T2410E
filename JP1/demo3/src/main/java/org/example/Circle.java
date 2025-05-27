package org.example;

public class Circle extends Shape {
    public double radius;
    @Override
    double area() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    double perimeter() {
        return 0;
    }
}
