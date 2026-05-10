import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {

        String s = "programming";

        HashSet<Character> seen = new HashSet<>();
        String result = "";

        for(char ch : s.toCharArray()) {
            if(!seen.contains(ch)) {
                seen.add(ch);
                result += ch;
            }
        }

        System.out.println(result);
    }
}