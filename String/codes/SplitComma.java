public class SplitComma {
    public static void main(String[] args) {

        String s = "apple,banana,mango,grapes";

        String[] arr = s.split(",");

        for (String word : arr) {
            System.out.println(word);
        }
    }
}
