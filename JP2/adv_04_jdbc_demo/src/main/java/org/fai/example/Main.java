package org.fai.example;

import org.fai.example.entity.Subject;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConnectJDBC.getInstance().getConnection();
        ServiceRepository serviceRepository = new ServiceRepository();
        var students = serviceRepository.findAll();
        for (var student : students) {
            System.out.println(student.toString());
        }
        System.out.println("Example with Procedure.");
        var students2 = serviceRepository.findAll("SP_GET_ALL_STUDENTS");
        for (var student : students2) {
            System.out.println(student.toString());
        }
        System.out.println("Example with Procedure Insert.");
        Subject subject = new Subject("JP2", "Java programming 2",3);
        serviceRepository.save(subject);
    }
}