// use of final key word in mathods 

public class final2 {
   void m1(){
    System.out.println("i am in final class");
   } 
}
 class test extends final2{
    void m1(){
        System.out.println("i am in class tyest");
    }
    public static void main(String[] args) {
        //test t = new test();
       // t.m1();
    }
 }
