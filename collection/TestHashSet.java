import java.util.ArrayList;
import java.util.HashSet;
public class TestHashSet {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(90);
        al.add(70);
        al.add(null);
        al.add(null);

        System.out.println(al);
        HashSet hs = new HashSet();
        hs.addAll(al);

        hs.add(80);
        hs.add("sanjay");
        hs.add("verma");
        hs.add(20);
        hs.add(67);
        hs.add(55);

        System.out.println(hs);

        System.out.println(hs.contains(70));

        System.out.println(hs.size());

        hs.clone();

        System.out.println(hs.isEmpty());

        System.out.println(hs.getClass());
        hs.clear();
        System.out.println(hs);

    }
}
