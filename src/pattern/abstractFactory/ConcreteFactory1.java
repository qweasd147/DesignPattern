package pattern.abstractFactory;

import pattern.abstractFactory.product.AbstractProductA;
import pattern.abstractFactory.product.AbstractProductB;
import pattern.abstractFactory.product.ProductA1;
import pattern.abstractFactory.product.ProductB1;

public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
