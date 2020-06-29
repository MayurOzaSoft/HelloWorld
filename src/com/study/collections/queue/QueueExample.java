package com.study.collections.queue;

import java.util.PriorityQueue;

public class QueueExample {

    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();
        System.out.println(priorityQueue.peek());
        // System.out.println(priorityQueue.element()); // NullPointerException

        for (int i = 0; i < 5; i++) {
            priorityQueue.offer(i);
        }

        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);

    }
}
