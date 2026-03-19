class Amstron{
       
      public static void main(String[] args)
      {
        int no = 153;
        int t1 = no;
        int leng = 0;

        while(no != 0){
                     t1 = t1 / 10;
                     leng = leng + 1;
                      }

         int t2 = no;
         int rem =  0;
         int arm = 0;
   
         while(t2 != 0)
          rem = t2 / 10;
          int mul = 1;

         for (int i=1 ;i<= leng; i++)
           {
             mul = mul * rem;

              }

            arm = arm + mul;
           t2 = t2 / 10;
            
           if (no == arm){
                            System.out.println("no is amstrong");
                                  }

                        else{
                              System.out.println("no is not amstrong");
                                }
         
         }
 }