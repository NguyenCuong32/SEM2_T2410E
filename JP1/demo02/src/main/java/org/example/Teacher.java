package org.example;

public class Teacher extends HomoSapien implements ITeacher,IStudent{


    @Override
    public void teach() {
        System.out.println("Teacher is teach.");
    }

    @Override
    public void study() {
        System.out.println("Teacher is studding");
    }
}
