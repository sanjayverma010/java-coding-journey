// INHERITANCE 
class Animal6
{
  void eat()
  {
    System.out.println("i am eating");  
    }
}
class Dog extends Animal6
{
 
   public static void main(String[] args)
{
   Dog d = new Dog();
   d.eat();
   
  }
}