package Iterator;

import java.util.Iterator;

public class ConcreteIterator implements Iterator<Integer> {
    private int[] items;
    private int position = 0;

    public ConcreteIterator(int[] items) {
        this.items = items;
    }

    public boolean hasNext() {
        return position<items.length;
    }

    public Integer next() {
        return items[position++];
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
