class BinarySarch{
       public static void main (String[] args)
       {
       int[] a ={3,5,6,8,9,11,12,14,16,17,19,20};
   
        int li = 0;
        int hi = a.length;
        int mi = (li+hi)/2;
         int srch = 12;

     while(li<=hi)
          {
            if(a[mi]==srch)
              { 
                System.out.print("srch in"+mi+ "index");
                 }
          else if(a[mi]<srch){
                   li = mi+1;
                     }
         else{
                 hi=mi-1;
                    }
           mi=(li+mi)/2;
         }
     if(li>hi){
              System.out.print("srch not available");
          }
     }
}