package poetchess.adapter.ducks;

import java.util.Random;

/**
 * Created by poetchess on 17-12-12.
 */
public class DuckAdapter implements Turkey {
    Duck duck;
    Random rand;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
        rand = new Random();
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        if (rand.nextInt(5) == 0 ) {
            duck.fly();
        }
    }
}
