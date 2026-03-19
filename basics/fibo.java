class Fibonacci{
      public static void main(String[] args)
         {
           int a = 1;
           int b = 2;
            System.out.print(a+" "+b);
           int c;
          
          for (int i=1; i<=10; i++)
             {
              c=a+b;
              System.out.print(" "+c);
              a=b;
              b=c;
           }       
      }
}