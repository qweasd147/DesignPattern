package pattern.iterator;

import java.util.Iterator;
import java.util.List;

public class ListConcreteAggregate<T> implements Aggregate<T> {

    List<T> items;

    public ListConcreteAggregate(List<T> items) {
        this.items = items;
    }

    @Override
    public Iterator<T> createIterator() {
        return new ListConcreteIterator<>(items);
    }
}
