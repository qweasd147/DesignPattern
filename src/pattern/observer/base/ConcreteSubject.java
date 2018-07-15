package pattern.observer.base;

import java.util.LinkedList;
import java.util.List;

public class ConcreteSubject implements Subject {

    List<Observer> observers = new LinkedList();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);

        notifyObservers();
    }

    @Override
    public void removeObserver(Observer observer) {
        int idx = observers.indexOf(observer);

        if(idx > -1){
            observers.remove(idx);
        }
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }
}
