package org.example;

public class Car implements ICar,IVehicle{
    @Override
    public void run() {
        System.out.println("Car is running");
    }
}
