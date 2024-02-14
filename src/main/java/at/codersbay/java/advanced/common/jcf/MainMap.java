package at.codersbay.java.advanced.common.jcf;

import java.util.HashMap;

public class MainMap {


    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apfel", 10);
        map.put("Banane", 20);
        map.put("Kirsche", 30);

        System.out.println(map);

        // Zugriff auf den Wert mit einem Schlüssel
        System.out.println("Apfel hat den Wert: " + map.get("Apfel"));
    }
}
