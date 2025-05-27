package org.example;

public class Square extends Shape {

    public double side;
    @Override
    double area() {
        return Math.pow(this.side,2);
    }

    @Override
    double perimeter() {
        return 4*side;
    }
}
