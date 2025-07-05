package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GenericObject<Teacher> teacherGenericObject = new GenericObject<>();
        Teacher teacher1 = new Teacher();
        teacher1.setName("Nam");
        teacher1.setAge(30);
        teacher1.setMajor("IT");
        teacherGenericObject.setItem(teacher1);
        Teacher teacher2 = new Teacher();
        teacher2.setName("Nam");
        teacher2.setAge(30);
        teacher2.setMajor("IT");
        teacherGenericObject.setItem(teacher2);
        teacherGenericObject.showInfo();

        GenericObject<Student> studentGenericObject = new GenericObject<>();
        Student student1= new Student();
        student1.setName("Hung");
        student1.setClassName("T2410E");
        studentGenericObject.setItem(student1);

        Student student2= new Student();
        student2.setName("Vu");
        student2.setClassName("T2410E");
        studentGenericObject.setItem(student2);
        studentGenericObject.showInfo();

    }
}