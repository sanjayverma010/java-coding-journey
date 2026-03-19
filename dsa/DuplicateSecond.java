import java.util.*;
class DuplicateMathod2
{
   public static void main (String[] args)
         {
        int[] ar={2,4,2,4,6,7,88,5,6,7,4,67,8};

       System.out.println("duplicates eliments are");

        Set<Integer> s=new HashSet<>();
        for(int no:ar)
           {
              Boolean b= s.add(no);
              if(b == false)
                {
                System.out.println(no+" ");
             }
          }
     }
}