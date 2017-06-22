package starbuzz;

/**
 * Created by poetchess on 17-6-21.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
