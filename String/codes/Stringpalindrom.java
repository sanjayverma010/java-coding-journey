public class Stringpalindrom {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("mam");

        String original = sb.toString();              // original
        String reversed = new StringBuffer(original).reverse().toString(); // reversed

        if (original.equals(reversed)) {
            System.out.println("string is palindrome");
        } else {
            System.out.println("string is not palindrome");
        }
    }
}