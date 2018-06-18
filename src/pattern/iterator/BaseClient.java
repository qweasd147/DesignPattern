package pattern.iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BaseClient {

    public static void main(String[] args) {
        Aggregate<Integer> intItems = new ArrayConcreteAggregate<>(new Integer[]{1, 2, 3, 4, 5, 6});
        Iterator<Integer> intIterator = intItems.createIterator();

        while (intIterator.hasNext()){
            System.out.println("배열 아이템 : "+intIterator.next());
        }

        intIterator = intItems.createIterator();

        while(intIterator.hasNext()){
            intIterator.remove();
        }

        List<String> items = new LinkedList<>();

        items.add("one");
        items.add("two");
        items.add("three");
        items.add("four");

        Aggregate<String> listItems = new ListConcreteAggregate<>(items);
        Iterator<String> listIterator = listItems.createIterator();

        while (listIterator.hasNext()){
            System.out.println("리스트 아이템 : "+listIterator.next());
        }

        listIterator = listItems.createIterator();

        while (listIterator.hasNext()){
            listIterator.remove();
        }
    }
}
