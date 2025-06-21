package org.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public void dequeExample(){
        Deque deque = new ArrayDeque();
        deque.addFirst(1);
        deque.addFirst(3);
        deque.addFirst("6");

        for (var d: deque){
            System.out.println(d);
        }
        System.out.println("Size of Queue "+ deque.size());
        System.out.println("First "+  deque.pollFirst()) ;
        System.out.println("Size of Queue "+ deque.size());
        System.out.println("Second "+  deque.pollFirst()) ;
        System.out.println("Size of Queue "+ deque.size());
        System.out.println("Third "+  deque.pollFirst()) ;
        System.out.println("Size of Queue "+ deque.size());
        System.out.println("Four "+  deque.pollFirst()) ;
        System.out.println("Size of Queue "+ deque.size());
    }
}
