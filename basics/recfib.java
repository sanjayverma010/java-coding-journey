class RicFibo{

      static int a = 1, b = 2, c;

      public static void main(String[] args)
      {
          System.out.print(a + " " + b);
          RicFibo ob = new RicFibo();
          ob.fibo(10);
      }
      

      void fibo(int i)
      {
      if(i>=0)
      {
      c= a+b;
      System.out.print(" "+c);
      a = b;
      b = c;
      fibo(i-1);
      }
    }
}
