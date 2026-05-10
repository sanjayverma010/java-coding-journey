public class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("sanjay");
        System.out.println(sb);

        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.charAt(5));
        sb.setCharAt(3, 'u');
        System.out.println(sb);
        System.out.println(sb.delete(7, 9));
        System.out.println(sb.deleteCharAt(3));
        System.out.println(sb.indexOf("j"));
        System.out.println(sb.indexOf("j")); // -1, because 'j' was replaced by 'i' in sb

        System.out.println(sb.replace(3, 6, "hyy")); // sanihyyverma

        System.out.println(sb.reverse()); // amrevyyhinas

        System.out.println(sb.subSequence(2, 4)); // re
        System.out.println(sb.substring(2, 6)); // revy

        System.out.println(sb.toString()); // amrevyyhinas

        sb.ensureCapacity(2000); // increases the capacity to at least 2000 characters
        System.out.println(sb.capacity()); // 2000

    }
}
