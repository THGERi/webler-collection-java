package hu.webler.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

    public static void main(String[] args) {

        Queue<String> names = new PriorityQueue<>();

        // Add elements to the PriorityQueue

        names.add("Bob");
        names.add("Alice");
        names.add("Charlie");

        // Peek at the element with the highest priority without removing it
        System.out.println(names.peek());
        // Poll the element with the highest priority and remove it from the queue
        System.out.println(names.poll());
        System.out.println(names.poll());
        // System.out.println(names.peek());
        System.out.println(names.poll());
    }
}
