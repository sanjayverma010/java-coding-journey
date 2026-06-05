import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class listDemo {
    public static void main(String[] args) {
        //List l = new ArrayList();
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(40);
        l.add(20);
        l.add(null);
        l.add(null);
        // System.out.println(l);

       // Iterator itr =l.Iterator();
       Iterator<Integer> itr = l.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
