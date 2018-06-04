package pattern.abstractFactory;

import pattern.abstractFactory.product.AbstractProductA;
import pattern.abstractFactory.product.AbstractProductB;
import pattern.abstractFactory.product.ProductA2;
import pattern.abstractFactory.product.ProductB2;

public class ConcreteFactory2 implements AbstractFactory{
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
