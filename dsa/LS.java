class liSarch{
    public static void main(String[] args)
         {
       String[] a={"sanjay","yash","kanha","vaishnavi"};
       String item = "yash";
       int temp = 0;

       for(int i =0; i<a.length; i++)
          {
         if(a[i].equals(item))
           {
            System.out.print("item presenrt in index "+ i);
             temp= temp+1;
             }
        }

   if(temp==0)
     {
       System.out.println("item not found");
        }
    }
}