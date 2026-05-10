class StringBufferUse {

    String s1 = new String("it is a string1");
    StringBuffer sb1 = new StringBuffer("it is a string2");
    boolean result1 = s1.equals(sb1); // false, because s1 and sb1 are different types
    boolean result2 = sb1.equals(s1); // false, because sb1 and s

    String s11String = s1.toString(); // converts StringBuffer to String
    String s22String = sb1.toString(); // converts StringBuffer to String
    boolean result3 = s11String.equals(s22String); // true, because both are

    public static void main(String[] args) {
        StringBufferUse obj = new StringBufferUse();
        System.out.println(obj.result1); // false
        System.out.println(obj.result2); // false
        System.out.println(obj.result3); // true
    }
}