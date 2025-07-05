package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        while (true){
            try {
                System.out.println("Please Enter from keyboard");
                Scanner scanner = new Scanner(System.in);
                int x = scanner.nextInt();
                System.out.println("X = " + x);
            }
            catch (Exception ex){
                System.out.println("Exception "+ex);
            }
        }
    }

}