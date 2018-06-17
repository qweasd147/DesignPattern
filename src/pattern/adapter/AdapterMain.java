package pattern.adapter;

import java.util.*;

public class AdapterMain {

    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();
        vector.add("obj0");
        vector.add("obj1");
        vector.add("obj2");

        Enumeration<String> enumeration = vector.elements();
        Iterator<String> enumIter = new EnumerationIterator<>(enumeration);

        while (enumIter.hasNext()){
            System.out.println(enumIter.next());
        }
    }
}
