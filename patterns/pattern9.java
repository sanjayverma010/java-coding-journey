class patt9{
         public static void main (String []args)
          {
             for(int i =1; i<=4; i++)
                {
                  for(int j = 1; j<=i; j++)
                  {
                    if(i>=2 && j<=i-1){
                                       System.out.print(" ");
                                         }
                                         else{
                                                 System.out.print("*");
                                                    }
                                for(int s=1; s<=4;s++)
            {
             for(int l=4; l>i; l--)
                 {
                    System.out.print(" ");
                   }
                     for(int k=1;k<=i ;k++) 
                        {
                           if(i>=2 && k>1)
                             {
                               System.out.print(" ");
                                 }
                                else{
                                      System.out.print("*");
                                        }
                                System.out.println(); 
                            }   
                      
                          }
                         
                      }
              }

	 	 	   	 	 				                      }
                           
                      }
              

