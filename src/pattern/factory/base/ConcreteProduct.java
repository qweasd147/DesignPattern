package pattern.factory.base;

public class ConcreteProduct implements Product{
    @Override
    public void use() {
        System.out.println("ConcreteProduct");
    }
}
