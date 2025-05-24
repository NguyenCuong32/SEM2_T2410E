package org.example;

public class Student extends HomoSapien implements IStudent{
    @Override
    public void study() {
        System.out.println("Student is studding");
    }
}
