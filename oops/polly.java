// POLLY MORPHISM WITH DIFFRENT ARGUMENTS 

class Test{
 void show(int a, String b)
 {
   System.out.println("1"); 
}

  void show(String a, int c)
 {
  System.out.println("2");
}

public static void main(String[] args)
 {
    Test T = new Test();
    T.show(10, "sanjay");
 }
}