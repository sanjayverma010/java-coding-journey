class AA{
   void showAA(){
        System.out.println("i am showing class A");
    }
}

class AB{
   void showAB(){
     Systtem.out.println("i am showing class AB"); 
    }
}

class AC{
   void showAC(){
      System.out.println("i am showing class AC");
    }

   public static void main(String[] args){
   
   obj2 = new AB();
   obj2.showAb();
   obj2.showAA();

  obj3 = new AC();
  obj3.showAC();
  obj3.showAB();
  obj3.showAA();

    }
 }