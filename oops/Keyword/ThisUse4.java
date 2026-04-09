public class ThisUse4 {
    void m1(ThisUse4 td) {
        System.out.println("m1 method");

    }

    void m2() {
        m1(this); // here this is used to pass current class object as an argument in m1 method
        // this keyword is used to pass current class object as an argument in m1 method
    }

    public static void main(String[] args) {
        ThisUse4 td = new ThisUse4();
        td.m2();
    }
}
