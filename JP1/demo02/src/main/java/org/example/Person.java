package org.example;

public class Person {
    // Định nghĩa hàm tạo mặc định
    public Person(){
        System.out.println("Ham tao mac dinh");
    }
    // Định nghĩa hàm tạo có đối số
    public Person(String name){
        System.out.println("Ham tao co tham so");
        this.name = name;
    }
    // Định nghĩa các thuộc tính của lớp Person
    public String name;
    public int age;
    public String address;

    // Định nghĩa các hành vi
    public void  walk(){
        System.out.println(name + " is walking");
    }

    public  void  sleep(){
        System.out.println(name +" is sleeping");
    }
    public void eat()
    {
        System.out.println(name +" is eating");
    }
}
