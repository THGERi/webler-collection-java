package hu.webler.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapPutAndPutIfAbsentExample {

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
        System.out.println("--------------------------------------------------");
        map.put("Egy", 10);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {


            System.out.println("Kulcs: " + entry.getKey() + ", Érték: " + entry.getValue());
        }
        System.out.println("--------------------------------------------------");
        Map<String, Integer> map2 = new HashMap<>();
        map2.putIfAbsent("Egy", 10);
        map2.putIfAbsent("Kettő", 10);

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            System.out.println("Kulcs: " + entry.getKey() + ", Érték: " + entry.getValue());
        }
        System.out.println("--------------------------------------------------");
        map2.putIfAbsent("Kettő", 20);
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            System.out.println("Kulcs: " + entry.getKey() + ", Érték: " + entry.getValue());
        }
    }
}
