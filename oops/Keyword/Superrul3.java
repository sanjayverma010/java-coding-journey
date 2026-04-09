//  static mathod can access only static data it can not access not static data (instance data)
// static mathod can call only other static other static mathod it can not call a non sataic mathods 
// A static can not refer this and super keyword in anyway 

class Superrul3_4_5 {
    // int a = 10;
    static int a = 10;
    static void display (){
        System.out.println(a); // rule 4 static mathod can access static data
       // System.out.println(this.a); // rule 5 static mathod can not refer this    
       //  System.out.println(a); // rule 3 static mathod can not access non static data
    }
}
class xyz{
    public static void main(String[] args) {
        Superrul3_4_5.display();
    }
}