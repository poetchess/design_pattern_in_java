package poetchess.adapter.iterenum;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

/**
 * Created by poetchess on 17-12-15.
 */
public class EnumerationIteratorTest {
    public static void main(String [] args) {
        Vector<String> v = new Vector<>(Arrays.asList(args));
        Iterator<?> i = new EnumerationIterator(v.elements());
        while (i.hasNext()) {
            System.out.println(i.next());
            //i.remove(); We are unable to implement it in enumeration class, let it throw exception.
        }
    }
}
