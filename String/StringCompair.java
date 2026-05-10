// PERFORMING .CompaitTo() mathod 
import java.util.*;
class StringCompair{
    public static void main (String[] args)
    {
        String s1 = "sanjay";
        String s2 = "Sanjay";

        System.out.println(s1.compareTo(s2));  //   OUTPUT = 32 
        System.out.println(s1.compareToIgnoreCase(s2)); // OUTPUT = 0
    }
}