package pattern.observer.base;

public class ConcreteObserver2 implements Observer{

    @Override
    public void update() {
        System.out.println(this.getClass().getName()+" update");
    }
}
