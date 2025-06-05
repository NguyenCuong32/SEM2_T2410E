package org.example;

public class Fighter extends Person{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    void attack() {

    }

    @Override
    void run() {

    }

    @Override
    void jump() {

    }
    void fight(){
        System.out.println(name +" fighting");
    }
}
