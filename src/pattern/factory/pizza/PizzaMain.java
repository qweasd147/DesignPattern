package pattern.factory.pizza;

public class PizzaMain {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza nyCheesePizza = nyStore.orderPizza("cheese");
        if(nyCheesePizza != null){
            System.out.println("Ethan ordered a "+nyCheesePizza.getName()+" pizza");
        }

        Pizza chicagoCheesePizza = chicagoStore.orderPizza("cheese");
        if(chicagoCheesePizza != null){
            System.out.println("Ethan ordered a "+chicagoCheesePizza.getName()+" pizza");
        }
    }
}
