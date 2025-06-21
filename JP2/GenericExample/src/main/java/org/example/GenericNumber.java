package org.example;

import java.util.ArrayList;
import java.util.List;

public class GenericNumber<T> {
    List<T> numbers;
    public List<T> enterNumber(T number){
        if (numbers==null){
            numbers = new ArrayList<>();
        }
        numbers.add(number);
        return numbers;
    }
    public void dislay(){
        for(T n:numbers){
            System.out.println(n);
        }
    }
}
