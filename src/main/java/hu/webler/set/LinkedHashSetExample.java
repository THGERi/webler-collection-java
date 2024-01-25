package hu.webler.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        Set<String> names = new LinkedHashSet<>();


        names.add("Alice");
        names.add("Charlie");
        names.add("Bob");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
