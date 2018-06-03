package pattern.factory.pizza;

import pattern.factory.pizza.product.NYStyleCheesePizza;
import pattern.factory.pizza.product.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {

        if ("cheese".equals(type)){
            return new NYStyleCheesePizza();
        }else if("veggie".equals(type)){
            return new NYStyleVeggiePizza();
        }else {
            return null;
        }
    }
}
