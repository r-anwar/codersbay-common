package at.codersbay.java.advanced.common.jcf;

import java.util.ArrayList;

public class MainArray {

    public static void main(String[] args) {

        String[] myArrayList = new String[10];
        int length = myArrayList.length;

        ArrayList<String> list = new ArrayList<>();
        list.add("Apfel");
        list.add("Banane");
        list.add("Kirsche");
        list.add("Pfirsich");

        System.out.println(list);

        // Zugriff auf ein Element
        System.out.println("Das erste Element ist: " + list.get(0));
        System.out.println("Das zweite Element ist: " + list.get(1));

        for(String entry : list) {
            System.out.println(entry);
        }

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
