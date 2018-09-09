package pattern.bridge.base;

public abstract class Abstraction {

    private Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void handleImpl(){
        implementor.implementation();
    }

    public abstract void extendFunc();
}
