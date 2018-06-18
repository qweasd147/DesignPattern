package pattern.iterator.base;

import java.util.Iterator;

public class BaseClient {

    public static void main(String[] args) {
        Aggregate<Integer> intItems = new ConcreteAggregate<>(new Integer[]{1, 2, 3, 4, 5, 6});
        Iterator<Integer> intIterator = intItems.createIterator();

        while (intIterator.hasNext()){
            System.out.println("배열 아이템 : "+intIterator.next());
        }

        intIterator = intItems.createIterator();

        while(intIterator.hasNext()){
            intIterator.remove();
        }
    }
}
