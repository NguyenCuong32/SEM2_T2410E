package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public  void  exampleQueue(){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(5);

        // Deque
        for (int q:queue)
        {
            System.out.println(q);
        }

    }
}
