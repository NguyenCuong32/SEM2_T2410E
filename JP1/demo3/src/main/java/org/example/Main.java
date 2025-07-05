package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Please input side: \r\n");
        double side = 10;
        Square square = new Square();
        square.side = side;
        double area = square.area();
        System.out.println("Area = " +area);

        Circle circle = new Circle();
        circle.radius = 10;
        double areaCircle = circle.area();
        System.out.println("Area circle =" + areaCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(10);
        rectangle.setWidth(5);
        double areaRec = rectangle.area();
        System.out.println("Area rectangle= " +areaRec);

        Rectangle rectangle1 = new Rectangle();
        int areaRecInt = rectangle1.area(2,3);
        System.out.println("Area Rec INT = "+areaRecInt);

        Car car = new Car();
        car.run();
    }
}