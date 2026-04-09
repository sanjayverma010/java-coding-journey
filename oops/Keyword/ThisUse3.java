class ThisDemo {
   ThisDemo()
    {
      this(10);
      System.out.println("no argumengt constructor");
   }

   ThisDemo(int a) {
      
      // this() is used to call no argument constructor in parameterized constructor.
     // this();
      System.out.println("parametrized constructor");
      // this() is used to call no argument constructor in parameterized constructor.

   }

   public static void main(String[] args) {
      ThisDemo td = new ThisDemo();
   }
}