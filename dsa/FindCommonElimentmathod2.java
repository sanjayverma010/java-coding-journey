import java.util.*;
class FindCommonElimentmathod2{
    public static void main(String[] args)
       {
       int[] arr1={1,2,4,6,7};
       int[] arr2={2,3,5,8,9};

     HashSet<Integer> hs=new HashSet<>();
      for(int no:arr1)
       {
         hs.add(no);
          }
      for(int no: arr2)
         {
         boolean b=hs.add(no);
         
          if(b==false)
            {
              System.out.println(no);
               }
           }
     }
}