import java.util.*;
public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(78);
        al.add(67);
        al.add(89);
        al.add("sanjay");
        al.add("good");

        System.out.println(al);


        LinkedList ll = new LinkedList(al);
        ll.add(60);
        ll.add("good");
        ll.add("aaaa");

        System.out.println(ll);

        ll.addFirst("hii");
        ll.addLast("bye");

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);

        System.out.println(ll.contains("good"));

        ll.clear();
        System.out.println(ll);



       // LinkedList ll = new LinkedList(al);

    }
}
