package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Đối tượng 1
        Person phamvu = new Person();
        phamvu.name ="Vu";
        phamvu.age = 20;
        phamvu.address ="Ha noi";

        phamvu.walk();
        phamvu.sleep();


        // Đối tượng 2:
        Person nam = new Person();
        nam.name ="Nguyen Van Nam";
        nam.age= 25;
        nam.address ="Nam dinh";

        nam.eat();

        Person hung = new Person("Hung");
        hung.walk();
        hung.sleep();
        hung.eat();
//        hung.run();

        HomoSapien homoSapien = new HomoSapien();
        homoSapien.name ="Homo";
        homoSapien.age =15;
        homoSapien.walk();
        homoSapien.run();

        Student student = new Student();
        student.name ="Ngoc";
        student.age =22;
        student.run();
        student.study();

        Teacher teacher = new Teacher();
        teacher.name ="Cuong";
        teacher.run();
        teacher.teach();
        teacher.study();

    }
}