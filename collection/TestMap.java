import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class TestMap {
    public static void main(String[] args) {
        
        Map map = new HashMap();
            map.put(101, "yash");
            map.put(103, "sanjay");
            map.put(104, "sanjay");
          //   map.replace(101, "sanjay");
          System.out.println(map.containsKey(101));
          System.out.println(map.containsValue("verma"));
          System.out.println(map.size());
          System.out.println(map.hashCode());
          System.out.println(map.isEmpty());
          System.out.println(map.putIfAbsent(101, "verma"));
          System.out.println(map.getClass());
          System.out.println(map.toString());

          

            System.out.println(map);
            System.out.println(map.get(111));

            Iterator itr = itr.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
        
    }
}
