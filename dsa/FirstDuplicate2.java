import java.util.*;
class FindFirstduplicate2{
      public static void main(String[] args) 
           {
        int[] a={2,4,5,6,7,4,2,5,7,7};
         int temp = -1;
        HashSet<Integer>hs=new HashSet<>();
       
        for(int i = a.length - 1; i >= 0; i--)
           {
            if(hs.contains(a[i]))
              {
                temp = i;
              }
             else{
                   hs.add(a[i]);
              }
          }
        if(temp != -1)
          {
          System.out.println("first duplicate element is"+a[temp]);
         }
        else{
            System.out.println("Duplicate element is not found");
          }
      }
}