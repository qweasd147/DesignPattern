package pattern.iterator;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayConcreteIterator<T> implements Iterator<T>{

    T[] items;
    int position = 0;

    public ArrayConcreteIterator(T[] items) {
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
            items = (T[]) Arrays.stream(items)
                    .filter((item) -> item != items[position])
                    .toArray();

            System.out.println("array items : "+Arrays.toString(items));
        }else{
            System.out.println("삭제 범위를 넘어갔음!");
        }
    }
}
