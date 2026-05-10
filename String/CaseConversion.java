public class CaseConversion {
    public static void main(String[] args) {
        String s = "sanjay";
        System.out.println(s.toUpperCase()); // SANJAY
        System.out.println(s.toLowerCase());  // sanjay
        int a = 10;
        String s1  = String.valueOf(a);
        System.out.println(s1); // 10
        char [] c = s.toCharArray();
        System.out.println(c); // sanjay

    }
}
