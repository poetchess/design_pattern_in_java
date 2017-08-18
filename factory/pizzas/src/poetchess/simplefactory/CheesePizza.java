package poetchess.simplefactory;

/**
 * Created by poetchess on 17-8-18.
 */
public class CheesePizza extends Pizza{
    public CheesePizza() {
        name = "Cheese Pizza";
        dough = "Regular Crust";
        sauce = "Marinara Pizza Sauce";
        toppings.add("Fresh Mozzarella");
        toppings.add("Parmesan");
    }
}
