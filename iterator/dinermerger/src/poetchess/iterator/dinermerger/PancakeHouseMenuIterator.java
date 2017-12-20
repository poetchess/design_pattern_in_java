package poetchess.iterator.dinermerger;

import java.util.ArrayList;

/**
 * Created by poetchess on 17-12-20.
 */
public class PancakeHouseMenuIterator implements Iterator {
    private ArrayList<MenuItem> items;
    private int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem item = items.get(position);
        position += 1;
        return item;
    }
}
