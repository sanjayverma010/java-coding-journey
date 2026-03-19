class DupliAliment {
    public static void main(String[] args) {
        int[] a = {3, 56, 23, 78, 98, 34, 67, 45, 7, 45, 89};
        for(int i = 0; i < a.length; i++) 
           {
            for(int j = i + 1; j < a.length; j++) 
               {
                if(a[i]==a[j] && i != j)
                  {
                    System.out.println("duplicate munber is "+ a[j]);
                     }
                }

           }
      }
}