package at.codersbay.java.advanced.common.jcf;

import java.util.LinkedList;

public class MainList {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apfel");
        list.addFirst("Banane");
        list.addLast("Kirsche");

        System.out.println(list);
    }
}
