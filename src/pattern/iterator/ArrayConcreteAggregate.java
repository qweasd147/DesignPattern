package pattern.iterator;

import java.util.Iterator;

public class ArrayConcreteAggregate<T> implements Aggregate<T> {

    T[] items;

    public ArrayConcreteAggregate(T[] items) {
        this.items = items;
    }

    @Override
    public Iterator<T> createIterator() {
        return new ArrayConcreteIterator(items);
    }
}
