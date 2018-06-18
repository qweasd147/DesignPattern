package pattern.iterator;

import java.util.Iterator;
import java.util.List;

public class ListConcreteIterator<T> implements Iterator<T> {

    List<T> items;
    int position = 0;

    public ListConcreteIterator(List<T> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return items.size()>position;
    }

    @Override
    public T next() {
        return items.get(position++);
    }

    @Override
    public void remove() {
        if(hasNext()){
            System.out.println("아이템 삭제 : "+items.get(position));
            items.remove(position);
            System.out.println("list items : " + items.toString());
        }

        else
            System.out.println("삭제할 아이템이 없음!");
    }
}
