package pattern.abstractFactory;

import pattern.abstractFactory.product.AbstractProductA;
import pattern.abstractFactory.product.AbstractProductB;

public class AbstractFactoryMain {

    public static void main(String[] args) {

        AbstractFactory factory1 = new ConcreteFactory1();

        AbstractProductA productAFromFactory1 = factory1.createProductA();
        AbstractProductB productBFromFactory1 = factory1.createProductB();

        AbstractFactory factory2 = new ConcreteFactory2();
        
        AbstractProductA productAFromFactory2 = factory2.createProductA();
        AbstractProductB productBFromFactory2 = factory2.createProductB();

    }
}
