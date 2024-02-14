package at.codersbay.java.advanced.common.generics.example_genericSearch;

public class Main {


    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4, 5};
        int integerResult = GenericSearch.contains(intArray, 1);

        System.out.println("found: " + integerResult);


        String[] stringArray = {"Hello", "World", "!"};
        String stringResult = GenericSearch.contains(stringArray, "Hi there");

        System.out.println("found: " + stringResult);
    }
}
