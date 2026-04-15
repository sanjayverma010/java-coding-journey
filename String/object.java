// import java.lang.Object;
class Object extends java.lang.Object {

    String s1 = new String("Sanjay");
    String s2 = new String("Sanjay");

    boolean result1 = s1 == s2; // false, because s1 and s2 reference different objects
    boolean result2 = s1.equals(s2); // true, because s1 and s

    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println(obj.result1); // false
        System.out.println(obj.result2); // true
    }
    
}
