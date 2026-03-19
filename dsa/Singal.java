class Single{
    public static void main(String[] args)
         {
       int[] a={2,4,5,3,2,5,6,8,5,8,5,5,7};
       int temp=a[0];

     for(int i=0; i<a.length; i++)
        {
          temp=temp^a[i];          
         }
      System.out.println("singale number is " + a[temp]);
     }
}