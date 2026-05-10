public class StringSarch {
    public static void main(String[] args) {
        String s = "sanjay";
        System.out.println(s.contains("s"));  // true
        System.out.println(s.startsWith("a")); // false
        System.out.println(s.endsWith("y")); // true
        System.out.println(s.indexOf(3)); // -1
        System.out.println(s.charAt(4)); // a
    }
}
