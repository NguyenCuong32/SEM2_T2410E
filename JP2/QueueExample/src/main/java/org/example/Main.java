package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        QueueExample queueExample = new QueueExample();
        queueExample.exampleQueue();
        System.out.println("Deque demo");
        DequeExample deque = new DequeExample();
        deque.dequeExample();
    }
}