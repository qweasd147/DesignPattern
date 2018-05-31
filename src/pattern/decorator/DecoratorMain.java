package pattern.decorator;

import pattern.decorator.beverage.Beverage;
import pattern.decorator.beverage.DarkRoast;
import pattern.decorator.beverage.Espresso;
import pattern.decorator.beverage.HouseBlend;
import pattern.decorator.condiment.Mocha;
import pattern.decorator.condiment.Soy;
import pattern.decorator.condiment.Whip;

public class DecoratorMain {

    public static void main(String[] args) {

        Beverage normalEspresso = new Espresso();
        System.out.println(normalEspresso.getDescription() + ", $" + normalEspresso.getCost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + ", $" + darkRoast.getCost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + ", $" + houseBlend.getCost());
    }
}
