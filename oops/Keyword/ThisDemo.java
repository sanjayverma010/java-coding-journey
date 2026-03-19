// this code is to invok current class 

class ThisDemo
{
   void display()
    {
    System.out.println("Hellow");
   }

   void show()
   {
   display(); // here the compiler can defaultly use the this keyword, no need to mention 
  // this.display() here both are the same thinsgs 
  }

 public static void main(String[] args)
{
   ThisDemo D = new ThisDemo();
   D.show();
} 
}