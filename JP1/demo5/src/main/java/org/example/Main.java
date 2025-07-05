package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        while (true){
            System.out.println("Please choice Square or Rectangle");
               try  {
                   Scanner scanner = new  Scanner(System.in);
                   int choice = scanner.nextInt();
                   switch (choice){
                       case 1:
                           // HCN
                           Rectangle rectangle = new Rectangle();
                           rectangle.setWidth(10);
                           rectangle.setHeight(5);
                           var areas = rectangle.area();
                           var pemitter = rectangle.pemiter();
                           System.out.println("Dien tich = "+areas +" Chu vi =" +pemitter);
                           break;
                       case 2:
                           Square square = new Square();
                           square.setSide(10);
                           var areaQ = square.area();
                           var pemiterQ = square.pemiter();
                           System.out.println("Dien tich ="+areaQ +" Chu vi = "+pemiterQ);
                           // Vuong
                           break;
                       default:
                           System.out.println("Invalid choice");
                           break;
                   }
               }catch (Exception exception){

               }
        }
    }
}