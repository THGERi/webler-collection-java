package hu.webler.list;

import java.util.*;

public class ListExample {

    public static void main(String[] args) {

        List<String> names = new Stack<>();
        names.add("Bob");
        names.add("Alice");
        names.add("Charlie");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("----------------------");

        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equalsIgnoreCase("Alice")) {
                names.remove(i);
            }
        }

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
