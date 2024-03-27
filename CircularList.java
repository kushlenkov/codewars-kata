import java.util.Arrays;

public class CircularList<T> {
    private T[] elements;
    private int index = - 1;
    private int length;

    public CircularList(final T... elements) {
        if (elements.length == 0) {
            throw new RuntimeException("List is empty"); // WTF
        }
        this.elements = elements;
        this.length = elements.length;
    }

    T next() {
        if (++index == length) {
            index = 0;
        }
        return elements[index];
    }

    T prev() {
        if (--index < 0) {
            index = length - 1;
        }
        return elements[index];
    }
}