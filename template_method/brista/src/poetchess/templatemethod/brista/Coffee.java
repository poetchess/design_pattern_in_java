package poetchess.templatemethod.brista;

/**
 * Created by poetchess on 17-12-19.
 */
public class Coffee extends CaffeinBeverage {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
