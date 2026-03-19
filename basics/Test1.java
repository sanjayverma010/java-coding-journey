class Test1
{
    int i;
    String s;
  // PROGRAMMER CAN CREATED CONSTRUCTOR
 Test1(){
         System.out.print("no constructor");    
      }
   public static void main(String[] args)
      {
    Test1 t = new Test1();
    System.out.print(t.i+ " " + t.s);
 }
}