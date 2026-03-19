class Test3 {
   void show() {
      System.out.println("1");
   }

   public static void main(String[] args) {
      Test3 t = new Test3();
      t.show();

      XYZ x= new XYZ();
      x.show();
   }
}

class XYZ extends Test3 {
   void show() {
      System.out.println("2");
   }
}