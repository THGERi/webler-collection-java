package hu.webler.collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Stack;

public class CollectionExample {

    public static void main(String[] args) {

        Collection<String> names = new HashSet<>();
        names.add("Bob");
        names.add("Alice");
        names.add("Charlie");

        for (String name : names) {
            System.out.println(name);
        }

        Collection<String> names2 = new Stack<>();

        System.out.println(Arrays.toString(names.toArray()));
    }
}