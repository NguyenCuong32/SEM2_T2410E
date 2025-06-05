package org.example;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    double area() {
        return width*height;
    }

    @Override
    double permiter() {
        return 2*(height+width);
    }
}
