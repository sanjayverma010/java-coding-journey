class SelectionStr{
      public static void main(String[] args)
          {
         int[] a={sanjay,yash,kavya,vaishnavi,shivani,kirti,deepak};

         int min; 
         String temp="";

         for(int i=0; i<a.length; i++)
           {
              min = i;
             for(int j=i+1; j<a.length; j++)
                {
                  if(a[j].CompairTo(a[min])<0)
                    {
                      min = j; 
                        }
                }  
             temp=a[i];
             a[i]=a[min];
             a[min]=temp;
           }
          
      for(int k=0; k<a.length; k++)
         {
           System.out.print(a[k]+" ");
            }
      }
  }  