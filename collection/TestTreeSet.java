import java.util.TreeSet;
public class TestTreeSet {
    public static void main(String[] args) {
        
        TreeSet ts = new TreeSet();
        ts.add(60);
        ts.add(90);
        ts.add(68);
        ts.add(89);
        ts.add(56);
        ts.add(50);
        System.out.println(ts);

        TreeSet ts1 = new TreeSet();
        ts1.add("sanjay");
        ts1.add("yash");
        ts1.add("vaishnavi");
        ts1.add("shivani");
        ts1.add("tuinkal");

        System.out.println(ts1);

        System.out.println(ts.contains(30));
        System.out.println(ts.getLast());
        System.out.println(ts.getClass());

        ts.remove(56);
        System.out.println(ts);

    

    }
}
