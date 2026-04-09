// Super is used to invoke immediate parent class constructor

public class super3 {
    super3() {
        System.out.println("this is class A");
    }
}

class B extends super3 {
    B() {
        // super(); // optional (Java calls it automatically)
        System.out.println("this is class B");
    }

    public static void main(String[] args) {
        B ob = new B();  // constructor call
    }
}