import java.util.*;
class Duplicate3{
      public static void main(String[] args)
           {
           int[] arr={4, 5,7,6,7,8,5,4,7,4,6,7};

           Map<Integer,Integer> hm = new HashMap<>();
           for(int no:arr){
              Integer count = hm.get(no);
              if(count == null)
                {
                hm.put(no,1);
               }
              else{
                 count = count+1;
                 hm.put(no,count);
                }
           }
           System.out.println("duplicate values are");
           Set<Map.Entry<Integer,Integer>>es=hm.entrySet();
           for(Map.Entry<Integer,Integer>me:es)
              {
             if(me.getValue()>1)
              {
               System.out.println(me.getKey()+" ");
               }
          }
      }
}