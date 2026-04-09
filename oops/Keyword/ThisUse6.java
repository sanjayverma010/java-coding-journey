public class ThisUse6 {
   ThisUse6 m1()
   {
    return this;
    }

    public static void main(String[] args) {
        ThisUse6 th = new ThisUse6();
        th.m1();
    }
}
