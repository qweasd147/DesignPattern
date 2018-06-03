package pattern.factory.pizza;

import pattern.factory.pizza.product.ChicagoStyleCheesePizza;
import pattern.factory.pizza.product.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if ("cheese".equals(type)){
            return new ChicagoStyleCheesePizza();
        }else if("veggie".equals(type)){
            return new ChicagoStyleVeggiePizza();
        }else {
            return null;
        }
    }
}
