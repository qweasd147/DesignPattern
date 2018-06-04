package pattern.abstractFactory;

import pattern.abstractFactory.product.AbstractProductA;
import pattern.abstractFactory.product.AbstractProductB;

public interface AbstractFactory {

    AbstractProductA createProductA();
    AbstractProductB createProductB();
}
