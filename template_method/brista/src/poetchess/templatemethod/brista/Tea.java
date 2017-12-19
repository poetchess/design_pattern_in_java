package poetchess.templatemethod.brista;

/**
 * Created by poetchess on 17-12-19.
 */
public class Tea extends CaffeinBeverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }
}
