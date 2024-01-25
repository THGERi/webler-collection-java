package hu.webler.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    // A példában a LinkedHashMap megőrzi a kulcsok beillesztési sorrendjét, így a bejárás során a kulcsokat a beszúrási
    // sorrendjükben kapjuk meg.

    public static void main(String[] args) {

        // LinkedHashMap létrehozása
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Kulcs-érték párok hozzáadása
        linkedHashMap.put("Három", 3);
        linkedHashMap.put("Kettő", 2);
        linkedHashMap.put("Egy", 1);

        // Érték lekérdezése kulcs alapján (a kulcsok beillesztési sorrendjében)
        int value = linkedHashMap.get("Kettő");
        System.out.println("Kettő kulcshoz tartozó érték: " + value);

        // Térkép bejárása (a kulcsok beillesztési sorrendjében)
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println("Kulcs: " + entry.getKey() + ", Érték: " + entry.getValue());
        }
    }
}
