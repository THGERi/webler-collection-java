package hu.webler.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        /*
        A TreeSet egy olyan implementációja a Set interfésznek, amely egy red-black tree (piros-fekete fát) használ az
        elemeinek sorrendjének megtartására. A sorrend vagy az elemek természetes sorrendje alapján történik, vagy egy
        meghatározott összehasonlító alapján.

        A megadott példában, mivel sztringeket tárolunk (Set<String>), a sztringek természetes sorrendjét használja a
        sorrend meghatározásához (lexikografikus sorrend). Amikor hozzáadja az "Alice", "Bob" és "Charlie" neveket a
        TreeSet-hez, azok lexikografikus sorrendbe rendeződnek.
        */

        Set<String> names = new TreeSet<>();

        names.add("Bob");
        names.add("Charlie");
        names.add("Alice");

        /*
        Összefoglalva, a TreeSet esetében a sorrend a piros-fekete fa és a sztringek természetes sorrendje miatt jön
        létre. Ha a hozzáadás sorrendje számít, érdemes lehet a LinkedHashSet-et használni.
        */
        for (String name : names) {
            System.out.println(name);
        }
    }
}
