package at.codersbay.java.advanced.common.jcf;

import java.util.ArrayList;

public class MainArray {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apfel");
        list.add("Banane");
        list.add("Kirsche");

        System.out.println(list);

        // Zugriff auf ein Element
        System.out.println("Das erste Element ist: " + list.get(0));
    }
}
