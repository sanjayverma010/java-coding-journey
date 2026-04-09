// super keyword can be use to refer immidiate parant class instance veriable

class SuperA{
    int a = 10;
}

class SuperB extends SuperA{
   int a = 20;
 
   void show(int a)
    {
       System.out.println(a); // this can print 10 because this can intialize .show mathod 
       System.out.println(this.a);  // this can print 20 because "this keyword" can refer to the current class object 
       System.out.println(super.a); // this can print 10 because "Super keyword" can refer to the parent class object 

    }

     public static void main(String[] args)
      {
      SuperB sb = new SuperB();
       sb.show(30);
     }
 }