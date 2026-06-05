import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo {
    public static void main(String[] args) {

        // CONTRUCTOR

        ArrayList al = new ArrayList(); // EMPTY CONSTRUCTOR
        al.add(10);
        al.add(90);
        al.add("sanjay");
        al.add("verma");

        System.out.println(al);

        ArrayList al1 = new ArrayList(al); // al1 STORES FULLY al VALUES

        System.out.println(al1);

        ArrayList al2 = new ArrayList(9); // ARRAYLIST SIZE IS 9 WE CAN STORE 9 ELIMENT
        al2.addAll(al1);
        System.out.println(al2.size()); // PRINT 0 BECOUSE ARRYLIST IS EMPTY

        // MATHOD

        al.add("good");

        al.add(3, 9);
        System.out.println(al);

        al.addAll(al2);

        System.out.println(al);

        // REMOVE MATHOD
        al.remove("verma");
        al.remove(3);

        System.out.println(al);

        // REMOVE ALL

        al1.removeAll(al2);
        al1.add(8908);
        System.out.println(al1);

        // CLEAR

        al2.clear();
        System.out.println(al2);

        // CONTAINS

        al.add(90);

        al.contains(90);

        System.out.println(al.contains(90));

        // SIZE

        System.out.println(al.size());

        // GET
        System.out.println(al);

        System.out.println(al.get(2));

        // SET
        al.set(1, "mr.");
        System.out.println(al);

        // INDEXOF

        System.out.println(al.indexOf("sanjay"));

        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
