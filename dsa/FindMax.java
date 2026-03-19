class Max{
     public static void main (String[] args)
        {
       int[] a ={2,4,5,6,8,12,23,45,67};
       int max = a[0];

   for(int i = 1; i<a.length; i++)
      {
        if(a[i]>max)
          {
             max=a[i];
              }
          } 
      System.out.println("max=" + max);

     }
}