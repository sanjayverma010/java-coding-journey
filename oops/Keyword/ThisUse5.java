class test 
{
  test(ThisUse5 td)
   {
     System.out.println("this is class Test");
   }
}

public class ThisUse5
{
   void m1()
    {
      test t = new test(this); // here this is used to pass current class object as an argument in test class constructor
    }

   public static void main(String[] args)  
   {
     ThisUse5 td = new ThisUse5();
     td.m1();
    }

}
