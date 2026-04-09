// calling static mathod without creating object of class


public class Staticmathod {
    
  void display() {
     System.out.println("im simpale mathod");
    }

  static void show(){
    System.out.println("Static mathod");
      }
    public static void main(String[] args)
    {
      Staticmathod sm = new Staticmathod();
         sm.display();
     Staticmathod.show();
    }
}
