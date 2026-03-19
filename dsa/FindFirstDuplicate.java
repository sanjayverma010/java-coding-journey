class FirstDuplicate{
      public static void main (String[] args)
            {
          int[] a={3,5,2,3,5,6,7,4,7,8};
          int temp = 0;
          for(int i=0; i<a.length; i++)
             {
              for(int j=i+1; j<a.length-1; j++)
                 {
                 if(a[i]==a[j])
                   {
                     System.out.println("first duplicate no is"+a[i]);
                      temp = temp+1; 
                    }
               }
             if(temp != 0)
              {
                break;
                }
           }   
      }
}