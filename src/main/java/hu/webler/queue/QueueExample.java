package hu.webler.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        // Queue létrehozása LinkedList segítségével
        Queue<String> queue = new LinkedList<>();

        // Elemek hozzáadása a sorhoz
        queue.add("Egy");
        queue.add("Kettő");
        queue.add("Három");

        // Elemek kiíratása és eltávolítása a sor elejéről (így elérve a következő elemet ...)
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
