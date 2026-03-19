// OBJECT INITIALIZATION AND VALU INSERTION BY REFREANCE VARIALE

class Animal5
{
  String color;
  int age;

  void initObj(String c , int a)
    {
     color = c;
     age = a;
   }
  void display ()
  {
    System.out.print(color +" " +age);
  }

   public static void main(String[] args)
         {
       Animal5 buzo = new Animal5();
       buzo.initObj("black" , 10);
       buzo.display(); 
    }
}