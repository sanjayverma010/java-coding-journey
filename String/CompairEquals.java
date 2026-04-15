public class CompairEquals {
    public static void main(String[] args) {
        String s1 = new String("Sanjay"); // creates a new String object in memory
        String s2 = new String("Sanjay"); // creates another new String object in memory

        System.out.println(s1 == s2); // false, because s1 and s2 reference different objects
        System.out.println(s1.equals(s2)); // true, because s1 and s2 have the same content

    }
}
