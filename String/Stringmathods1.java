// PERFORMING equals() and equalsIgnorcase()

import java.util.*;
public class Stringmathods1{
    public static void main(String[] args)
    {
        String s1 = new String("sanjay");
        String s2 = new String("Sanjay");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}