package at.codersbay.java.advanced.common.jcf;

import java.util.HashSet;

public class MainSet {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apfel");
        set.add("Banane");
        set.add("Apfel");

        System.out.println(set); // Duplikate werden nicht hinzugefügt
    }
}
