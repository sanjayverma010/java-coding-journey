public class FirstNonRepeating {
    public static void main(String[] args) {
        String s = "aabbcdde";
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);

            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                System.out.println(ch);
                break;
            }
        }
    }
}
