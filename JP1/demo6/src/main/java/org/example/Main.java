package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Calulate shape");
        while (true){
            try {
                System.out.println("Enter a number: ");
                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();
                switch (choice)
                {
                    case 1:
                        System.out.println("Please enter side");
                        double side = scanner.nextDouble();
                        Square square = new Square();
                        square.setSide(side);
                        double areaSquare = square.area();
                        double permiter = square.permiter();
                        System.out.println("Area "+areaSquare +" Permitter " +permiter );
                        break;

                    case 2:
                        System.out.println("Please enter width: ");
                        double width = scanner.nextDouble();
                        System.out.println("Please enter height: ");
                        double height = scanner.nextDouble();

                        Rectangle rectangle = new Rectangle();
                        rectangle.setHeight(height);
                        rectangle.setWidth(width);

                        double areaRec = rectangle.area();
                        double permiterRec = rectangle.permiter();

                        System.out.println("Area "+areaRec +" Permitter " +permiterRec );
                        break;
                }
            }catch (Exception exception)
            {
                System.out.println(exception.getMessage());
            }
        }
    }
}