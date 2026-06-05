import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(100);
        s.add(10);
        s.add(500);
        s.add(null);
        s.add(null);

        System.out.println(s);

        Iterator itr = s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
