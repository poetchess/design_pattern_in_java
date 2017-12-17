package poetchess.adapter.iterenum;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by poetchess on 17-12-15.
 */
public class IteratorEnumeration implements Enumeration<Object>{
    Iterator<?> iterator;

    public IteratorEnumeration(Iterator<?> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
