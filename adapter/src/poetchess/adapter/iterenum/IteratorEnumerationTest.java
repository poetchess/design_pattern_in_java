package poetchess.adapter.iterenum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

/**
 * Created by poetchess on 17-12-15.
 */
public class IteratorEnumerationTest {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>(Arrays.asList(args));
        Enumeration<?> e = new IteratorEnumeration(l.iterator());
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
