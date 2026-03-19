import java.util.HashSet;
class RemoveDuplicateElement3
{
  public static void main(String[] args)
  {
   int[] a={1,2,3,2,4,6,5,5,7,9};

   HashSet<Integer> hs= new HashSet<>();
   for(int i=0; i<a.length;i++)
      {
     hs.add(a[i]);
    }
   for(int no:hs)
      {
      System.out.print(no+" ");
         } 
     }
}
  