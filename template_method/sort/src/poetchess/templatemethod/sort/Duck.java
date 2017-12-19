package poetchess.templatemethod.sort;

/**
 * Created by poetchess on 17-12-19.
 */
public class Duck implements Comparable<Duck> {
    private String name;
    private int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public String toString() {
        return name + " weights " + weight;
    }

    @Override
    public int compareTo(Duck o) {
        Duck otherDuck = o;

        if (this.weight < otherDuck.weight) {
            return -1;
        } else if (this.weight == otherDuck.weight) {
            return 0;
        } else {
            return 1;
        }
    }
}
