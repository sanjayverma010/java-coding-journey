import java.util.*;
public class Substings {
    public static void main(String[] args) {
        String s = "this is substrings class";

        System.out.println(s.subSequence(3, 6));
        System.out.println(s.substring(5));
        System.out.println(s.substring(4,9));
        System.out.println(s.substring(0, 0));
    }
}
