package at.codersbay.java.advanced.common.generics.example_box;

import at.codersbay.java.advanced.common.generics.example_box.GenericBox;

/**
 *
 */
public class Main {

    public static void main(String[] args) {

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.setContent("Der Inhalt ist ein String");

        GenericBox<Boolean> booleanBox = new GenericBox<>();
        booleanBox.setContent(true);

        GenericBox<Integer> integerBox = new GenericBox<>();
        integerBox.setContent(1);

        GenericBox<Long> longBox = new GenericBox<>();
        longBox.setContent(1L);

        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.setContent(1.0);

    }
}
