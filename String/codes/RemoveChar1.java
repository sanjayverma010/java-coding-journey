import java.util.*;

public class RemoveChar1 {
    public static void main(String[] args) {

        String s1 = "computer";
        String s2 = "cat";

        HashSet<Character> set = new HashSet<>();

        // store s2 characters
        for(char ch : s2.toCharArray()) {
            set.add(ch);
        }

        String result = "";

        // check s1
        for(char ch : s1.toCharArray()) {
            if(!set.contains(ch)) {
                result += ch;
            }
        }

        System.out.println(result);
    }
}