package pattern.decorator.condiment;

import pattern.decorator.beverage.Beverage;

public class Soy extends CondimentDecorator{

    public Soy(Beverage beverage) {
        this.beverage = beverage;
        this.condimentName = "두유";
        this.condimentCost = 0.15;
    }
}
