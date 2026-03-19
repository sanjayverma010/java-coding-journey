class MissingNumber{
      public static void main(String[] args)
        {
    int[] a={1,2,3,4,5,6,7,9};
      int Expected_no_of_eliment=a.length+1;
      int total_sum=Expected_no_of_eliment+(Expected_no_of_eliment+1)/2;
      
      int sum =0;
      for(int i=0; i<a.length; i++)
        {
          sum= sum+1;
            }
  System.out.println("missing nun=mber is "+" "+(total_sum - sum));
   } 
}