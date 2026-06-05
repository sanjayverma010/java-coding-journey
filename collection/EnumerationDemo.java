import java.util.*;
import java.util.Vector;
import java.util.Enumeration;
public class EnumerationDemo
 {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.add(10);
        v.add("sanjay");
        v.add(50);
        v.add(78);
        v.add(12.5);

        System.out.println(v);

        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
