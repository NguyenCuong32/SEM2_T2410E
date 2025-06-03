package org.example;

public class Rectangle extends Shape{
    private  double width;
    private  double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width/2;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    double area() {
        return this.width*this.height;
    }
    int area(int width, int height){
        System.out.println("INT");
        return  width*height;
    }
    double area(double width,double height){
        System.out.println("DOUBLE");
        return  width*height;
    }

    double plus(double x, double y){
        return  x+y;
    }
    double plus(double x, double y,double z){
        return  x+y+z;
    }
    @Override
    double perimeter() {
        return 0;
    }
}
