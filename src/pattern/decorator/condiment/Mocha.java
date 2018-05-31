package pattern.decorator.condiment;

import pattern.decorator.beverage.Beverage;

public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        this.condimentName = "모카";
        this.condimentCost = 0.2;
    }
}
