package poetchess.simplefactory;

/**
 * Created by poetchess on 17-8-18.
 */
public class PizzaStore {

    // Object composition allows us to change behavior dynamically at runtime
    // because we can swap in and out implementations.
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {

        Pizza pizza;
        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
