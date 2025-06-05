package org.example;

public class Hero extends Person{
    private String name;
    private double damage;
    private double hp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    @Override
    void attack() {
        System.out.println(name +" is attack with damage: " +damage);
    }

    @Override
    void run() {
        System.out.println("Hero "+name +" runing");
    }

    @Override
    void jump() {
        System.out.println("Hero "+name +" jumping");
    }
}
