package at.codersbay.java.advanced.common.generics.example_box;

public class GenericBox<T> {

    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
