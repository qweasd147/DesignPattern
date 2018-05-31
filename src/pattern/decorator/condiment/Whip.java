package pattern.decorator.condiment;

import pattern.decorator.beverage.Beverage;

public class Whip extends CondimentDecorator{

    public Whip(Beverage beverage) {
        this.beverage = beverage;
        this.condimentName = "휘핑 크림";
        this.condimentCost = 0.1;
    }
}
