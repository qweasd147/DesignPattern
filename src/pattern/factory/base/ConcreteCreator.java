package pattern.factory.base;

public class ConcreteCreator extends Creator{
    @Override
    public Product create() {
        System.out.println("create item");

        return new ConcreteProduct();
    }
}
