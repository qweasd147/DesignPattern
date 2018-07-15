package pattern.observer.concrete;

public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

    void notifyObservers();
}
