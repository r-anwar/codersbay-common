package at.codersbay.java.advanced.common.jcf;

import java.util.HashSet;

public class MainSet {

    public static void main(String[] args) {


        HashSet<String> set = new HashSet<>();

        set.add("Apfel");
        set.add("Banane");

        System.out.println(set.size());

        set.add("Apfel");
        System.out.println(set.size());

        set.add("Pfirsich");
        System.out.println(set.size());


        HashSet<Integer> mySet = new HashSet<>();
        mySet.add(1);
        mySet.add(5);
        mySet.add(4);
        mySet.add(1);

        System.out.println(mySet); // Duplikate werden nicht hinzugefügt
    }
}
