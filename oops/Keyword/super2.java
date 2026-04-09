// super keyword can be use to invock immidiate parent class mathod 

class A{
  void m1(){
     System.out.println("this is class A and you are in class A");
   }
}

class B extends super3{
   void m1()
    {
      System.out.println("you are in class B");
   }

    void show(){
      m1();
      super.m1();
    }

    public static void main(String[] args)
    {
      B ob = new B();
       ob.show();
   }
}