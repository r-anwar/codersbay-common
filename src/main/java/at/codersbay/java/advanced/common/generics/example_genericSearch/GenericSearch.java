package at.codersbay.java.advanced.common.generics.example_genericSearch;

public class GenericSearch {

    /**
     * Eine generische Methode zum Durchsuchen eines Arrays
     * @param array
     * @param element
     * @return
     * @param <T>
     */
    public static <T> T contains(T[] array, T element) {
        for (T item : array) {
            if (item.equals(element)) {
                return item;
            }
        }
        return null;
    }
}
