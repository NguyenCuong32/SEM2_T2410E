package org.example;

import java.util.ArrayList;
import java.util.List;

public class GenericObject <T> {
    private List<T> items;

    public List<T> setItem(T item){
        if (items == null)
        {
            items = new ArrayList<>();
        }
        items.add(item);
        return items;
    }
  public void showInfo(){
        for (T t:items)
        {
            System.out.println(t.toString());
        }
  }
}
