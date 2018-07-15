package pattern.observer.base;

public class BaseMain {

    public static void main(String[] args) {
        //변화를 알려주고 observer 객체들을 담을 클래스
        ConcreteSubject concreteSubject = new ConcreteSubject();

        //옵저버들
        ConcreteObserver1 concreteObserver1 = new ConcreteObserver1();
        ConcreteObserver2 concreteObserver2 = new ConcreteObserver2();

        //등록
        System.out.println("등록 시 notify");
        concreteSubject.registerObserver(concreteObserver1);
        concreteSubject.registerObserver(concreteObserver2);

        System.out.println("직접 notify");
        concreteSubject.notifyObservers();
    }
}
