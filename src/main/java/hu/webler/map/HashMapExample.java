package hu.webler.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        // HashMap példány létrehozása
        Map<String, Integer> map = new HashMap<>();

        // Kulcs-érték párok hozzáadása
        map.put("Egy", 1);
        map.put("Három", 3);
        map.put("Kettő", 2);

        // Érték lekérdezése kulcs alapján
        int ertek = map.get("Kettő");
        System.out.println("Kettő kulcshoz tartozó érték: " + ertek);

        // Map bejárása
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Kulcs: " + entry.getKey() + ", Érték: " + entry.getValue());
        }
    }
}
