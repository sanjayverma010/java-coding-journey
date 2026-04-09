// use of final class 

final class final3 {
   void m1(){
    System.out.println("i am in final class");
   } 
}
 class test1 extends final3{
    void m1(){
        System.out.println("i am in class tyest");
    }
    public static void main(String[] args) {
        //test t = new test();
       // t.m1();
    }
    
}
