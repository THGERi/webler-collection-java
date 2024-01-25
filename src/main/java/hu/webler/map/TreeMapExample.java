package hu.webler.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    //  A példa bemutatja, hogy a kulcsok rendezetten tárolódnak a TreeMap-ben, és a kulcsok sorrendje a természetes
    //  rendezési sorrendjük szerint van.

    public static void main(String[] args) {

        // TreeMap létrehozása
        Map<String, Integer> treeMap = new TreeMap<>();

        // Kulcs-érték párok hozzáadása
        treeMap.put("Kettő", 2);
        treeMap.put("Három", 3);
        treeMap.put("Egy", 1);

        // Érték lekérdezése kulcs alapján (a kulcsok rendezett sorrendjében)
        int value = treeMap.get("Kettő");
        System.out.println("Kettő kulcshoz tartozó érték: " + value);

        // Térkép bejárása (a kulcsok rendezett sorrendjében)
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Kulcs: " + entry.getKey() + ", Érték: " + entry.getValue());
        }
    }
}
