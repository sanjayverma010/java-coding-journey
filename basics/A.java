class A {
    void showA() {
        System.out.println("method of class A");
    }
}

class B extends A {   // "extends" not "extend"
    void showB() {
        System.out.println("method of class B");
    }
}
class C extends A{

     void showC(){
    System.out.println("mathod of class C");
   }


    public static void main(String[] args) {
        A ob1 = new A();   // create object of A
        ob1.showA();       // call method of A

        B ob2 = new B();   // create object of B
        ob2.showA();       // inherited method from A
        ob2.showB();       // method of B
       
      C ob3 = new C();
       ob3.showA();
       ob3.showC();

    }
}
