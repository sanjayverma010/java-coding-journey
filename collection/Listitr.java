import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Listitr {
    public static void main(String[] args) {
         List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(40);
        l.add(20);
        l.add(null);
        l.add(null);

        System.out.println(l);

        ListIterator lr = l.listIterator();
        while (lr.hasNext()) {
            System.out.println(lr.next());
            
        }

        
        while(lr.hasPrevious()){
            System.out.println(lr.previous());

            
        }

        l.remove(null);

        System.out.println(l);

        lr.add(1000);

       // lr.set(200);

            System.out.println(l);

        
        

        
    }
}
