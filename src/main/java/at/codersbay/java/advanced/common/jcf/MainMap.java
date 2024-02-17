package at.codersbay.java.advanced.common.jcf;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class MainMap {


    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();







        map.put("Apfel", 10);
        map.put("Apfel", 5);
        map.put("Banane", 20);
        map.put("Kirsche", 30);

        map.put("Pfirsiche", 15);

        System.out.println(map);

        int count = map.get("Pfirsiche");

        System.out.println("Pfirsiche: " +  count);

        // Zugriff auf den Wert mit einem Schlüssel
        System.out.println("Apfel hat den Wert: " + map.get("Apfel"));


        Set<String> keys = map.keySet();

        Collection<Integer> values = map.values();

        for(String key : keys) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
