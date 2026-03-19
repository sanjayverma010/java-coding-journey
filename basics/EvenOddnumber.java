import java.util.*;
class EvenOddnumber{
      public static void main(String[] args)
         {
        int[] a={8, 5, 10, 12, 3, 1, 4};

       ArrayList<Integer>al1=new ArrayList<>();  
       ArrayList<Integer>al2=new ArrayList<>();

      for(int i=0; i<a.length; i++)
         {
           if(a[i]%2==0)
             {
               al1.add(a[i]);
                 }
         else{
               al2.add(a[i]);
                 }
          } 
          
         int temp1=0; 
         System.out.println("even numbers are");
         for(int no:al1)
            {
              System.out.println(no);
             temp1=temp1+no;
       
                }
                System.out.print(temp1);
                System.out.println("array size is"+ al1.size());
            System.out.println("\n");
          System.out.println("odd numbers are");

            int temp2=0;
           for(int no:al2)
              {
                System.out.println(no);
                temp2=temp2+no;
                
                 }
              System.out.println("array sizw is"+ al2.size());
                System.out.print(temp2);
      }
}