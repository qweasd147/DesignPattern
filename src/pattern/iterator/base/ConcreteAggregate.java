package pattern.iterator.base;

import java.util.Iterator;

public class ConcreteAggregate<T> implements Aggregate<T>{

    T[] items;

    public ConcreteAggregate(T[] items) {
        this.items = items;
    }

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator(items);
    }
}
