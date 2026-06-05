import java.util.TreeMap;
public class DemoTreemap
{
    public static void main(String[] args) {
      TreeMap tm = new TreeMap();
     
       tm.put(101, "Sanjay");
       tm.put(102, "verma");
       tm.put(103, "good");
       tm.put(104, "bed");
       tm.put(100, "i'm");

       System.out.println(tm);

    //    tm.put("sanjay", 100);
    //    tm.put("yash", 800);
    //    tm.put("vaishu", 200);
    //    tm.put("tuinkal", 300);
    //    tm.put("shivi", 700);

       // System.out.println(tm);

       System.out.println(tm.ceilingKey(100));
       System.out.println(tm.firstKey());
       System.out.println(tm.floorKey(200));
       System.out.println(tm.get(100));
       System.out.println(tm.getOrDefault(100, "sanjay"));
       System.out.println(tm.containsKey(103));
       System.out.println(tm.containsValue("sanjay"));
       System.out.println(tm.entrySet());
       System.out.println(tm.lowerKey(100));
       
       System.out.println(tm.floorKey(104));
       System.out.println(tm.floorEntry(104));
       System.out.println(tm.isEmpty());
       System.out.println(tm.pollFirstEntry());
       System.out.println(tm.pollLastEntry());
       System.out.println(tm.subMap(102, 106));


       
    }
}