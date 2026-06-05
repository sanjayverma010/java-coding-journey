import java.util.Vector;

public class vectorclass {
    public static void main(String[] args) {
        Vector v = new Vector();
        System.out.println(v.size());
        System.out.println(v.capacity());

        v.add("sanjay");
        v.add(1, "verma");
        v.addElement("hii");
        v.addFirst(7);
        v.addLast(9);
        System.err.println(v);
        v.setElementAt(3, 3);

        System.out.println(v.size());
        System.out.println(v);

    }
}