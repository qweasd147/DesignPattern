package pattern.iterator.base;

import java.util.Iterator;

/**
 * Iterator를 만드는 뼈대 역할을 하는 인터페이스
 * @param <T>
 */
public interface Aggregate<T> {

    Iterator<T> createIterator();
}
