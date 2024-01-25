package hu.webler.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ThreadSafeList {

    public static void main(String[] args) {

        // A Vector osztály az egyik szálbiztos List implementáció. A metódusokat szinkronizálja,
        // így a műveletek biztonságosak többszálas környezetben is.
        List<String> vectorList = new Vector<>(); // regarding naming convention we do not use the collection type in name!!!

        //  A Collections osztály számos olyan metódust kínál, amelyek szálbiztos kollekciókat hoznak létre a meglévő kollekciókból.
        List<String> synchronizedList = Collections.synchronizedList(new ArrayList<>()); // regarding naming convention we do not use the collection type in name!!!

        /*
        Ez utóbbi példa egy szinkronizált List-et hoz létre, amely biztonságosan használható többszálas környezetben.
        Fontos megjegyezni, hogy bár a szinkronizált kollekciók használhatók a szálbiztonságos programozás során, néha
        hatékonysági problémákat okozhatnak nagy terhelés esetén, és más megoldásokat, például a java.util.concurrent
        csomagot lehet érdemesebb alkalmazni.
        */
    }
}
