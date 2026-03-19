class anoarr{
     public static void main(String[] args)
         {
    anoarr.sum(new int[][] {{10,20,30},{40,50,60}});

}
        static void sum(int[][] no)
{
       int total=0;
       
       for(int ij[]:no)
          {
             for(int i: ij)
                {
            total= total+i;
              }
          }
            System.out.print(total);
              
        
            }  
      
}