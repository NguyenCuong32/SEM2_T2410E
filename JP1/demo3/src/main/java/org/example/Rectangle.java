package org.example;

public class Rectangle extends Shape{
    public double Width;
    public double Height;
    @Override
    double area() {
        return this.Height*this.Width;
    }

    @Override
    double perimeter() {
        return 0;
    }
}
