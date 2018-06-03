package pattern.factory.pizza.product;

import pattern.factory.pizza.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dought = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Sgredded Mozzarella Cheese");
    }

    @Override
    protected void cut() {
        System.out.println("피자를 사각형으로 자른다.");
    }
}
