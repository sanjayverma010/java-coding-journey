public class StringDemo {
    public static void main(String[] args) {

        // char[] s1 = new char[]{'a','b','c'};
        String s2 = new String("abc");

       //  System.out.println("s1 :- " + new String(s1)); // fix
        System.out.println("s2 :- " + s2);

        char[] s1 = { 'a', 'b', 'c' };

        System.out.println(s1); // [C@659e0bfd
        System.out.println(s1); // decimal
        System.out.println(Integer.toHexString(s1.hashCode())); // hex
    }
}