package hu.webler.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();

        names.add("Alice"); // nem teszi bele kétszer, elkderüli a duplikációt!
        names.add("Alice");
        names.add("Charlie");
        names.add("Bob");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("----------------------");

        Set<String> names2 = new HashSet<>();

        names2.add("Alice");
        names2.add("Bob");
        names2.add("Charlie");

        names2.forEach(System.out::println); // method reference (::) - a System.out::println ugyanaz, mint a System.out.println
    }
}
