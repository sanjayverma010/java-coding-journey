class ThisDemo {
   ThisDemo() {
      System.out.println("no argumengt constructor");
   }

   ThisDemo(int a) {
         this(); // this() is used to call no argument constructor in parameterized constructor.
      System.out.println("parametrized constructor");
      // this() is used to call no argument constructor in parameterized constructor.
      
   }

   public static void main(String[] args) {
      ThisDemo td = new ThisDemo(10);
   }
}