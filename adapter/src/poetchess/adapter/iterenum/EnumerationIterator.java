package poetchess.adapter.iterenum;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by poetchess on 17-12-15.
 */
public class EnumerationIterator implements Iterator<Object> {
    Enumeration<?> enumration;

    public EnumerationIterator(Enumeration<?> enumeration) {
        this.enumration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumration.nextElement();
    }
}
