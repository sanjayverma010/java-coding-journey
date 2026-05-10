import java.util.HashSet;

public class Duplicateprint {
    public static void main(String[] args) {
        
        String s = "adweWijasdlkn.WAiwsd.ASKDN.KSAJDaAS.kajweddsf";

        HashSet<Character> unique = new HashSet<>();
        HashSet<Character> duplicate = new HashSet<>();

        for(char ch : s.toCharArray()) {

            if(!unique.contains(ch)) {
                unique.add(ch);
            } else {
                duplicate.add(ch);
            }
        }

        System.out.println("Duplicates: " + duplicate);
    }
}