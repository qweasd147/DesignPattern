package pattern.iterator.base;

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.IntStream;

public class ConcreteIterator<T> implements Iterator<T>{

    T[] items;
    int position = 0;

    public ConcreteIterator(T[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position>=items.length || items[position] == null) return false;
        else    return true;
    }

    @Override
    public T next() {
        return items[position++];
    }

    @Override
    public void remove() {
        if(hasNext()){
            System.out.println("삭제 : "+items[position]);

            items = (T[]) IntStream.range(0, items.length)
                    .filter( arrIdx -> arrIdx != position )
                    .mapToObj( arrIdx -> items[arrIdx])
                    .toArray();

            System.out.println("array items : "+Arrays.toString(items));
        }else{
            System.out.println("삭제 범위를 넘어갔음!");
        }
    }
}
