package pattern.decorator.condiment;

import pattern.decorator.beverage.Beverage;

public class CondimentDecorator extends Beverage {

    protected Beverage beverage;

    protected String condimentName = "";
    protected double condimentCost = 0;

    public String getDescription() {
        return beverage.getDescription() + "+"+ this.condimentName;
    }

    public double getCost() {
        return beverage.getCost()+condimentCost;
    }
}
