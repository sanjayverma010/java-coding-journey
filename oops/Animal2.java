class Animal2
{
      public void eat()
       {
      System.out.println("i am eating");
    }
  public static void main(String[] args)
       {
      System.out.println("1");
      Animal2 buzo = new Animal2();
      buzo.eat();
      buzo.run();

      Animal2 aa = new Animal2();
      aa.run();
      aa.eat();
    }
   public void run()
      {
      System.out.println("i am running");
    }
}

