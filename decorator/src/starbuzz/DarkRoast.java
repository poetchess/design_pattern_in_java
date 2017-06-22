package starbuzz;

/**
 * Created by poetchess on 17-6-21.
 */
public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
