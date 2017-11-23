package poetchess.simplefactory;

/**
 * Created by poetchess on 17-8-18.
 */

// Seems just pushing the problem from one object to another object?
// By encapsulating the creation in one class, there's now only one place to
//   make modifications when the implementation changes.

// A similar design: a factory is defined as a static method.
// Defining a simple factory as a static method is a common technique and is
//   often called a static factory. Because we don't need to instantiate an
//   object to make use of the create method. The disadvantage of the static
//   factory is that we can't subclass and change the behavior of the create
//   method.
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {

        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}
