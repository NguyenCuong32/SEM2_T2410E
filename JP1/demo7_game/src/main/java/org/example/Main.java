package org.example;

import java.util.ArrayList;
import java.util.List;
import org.example.models.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Hero> heroList = new ArrayList<>();

        Hero heroBoris = new Hero();
        heroBoris.setName("Boris");
        heroBoris.setHp(10);
        heroBoris.setDamage(4);
        heroList.add(heroBoris);


        Hero heroAthur = new Hero();
        heroAthur.setName("Athur");
        heroAthur.setDamage(30);
        heroAthur.setHp(50);
        heroList.add(heroAthur);

       for (var hero: heroList){
           System.out.println(hero.getName());
           hero.attack();
           System.out.println(hero.getDamage());
           System.out.println(hero.getHp());
       }
        Student student = new Student();

    }
}