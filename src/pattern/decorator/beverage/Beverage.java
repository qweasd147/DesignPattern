package pattern.decorator.beverage;

public abstract class Beverage {

    protected String description = "제목 없음";
    protected double cost = 0;

    public String getDescription(){
        return description;
    }

    public double getCost(){
        return cost;
    };
}
