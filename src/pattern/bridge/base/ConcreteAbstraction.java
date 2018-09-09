package pattern.bridge.base;

public class ConcreteAbstraction extends Abstraction{

    public ConcreteAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void extendFunc() {}
}
