class StringBufferdemo {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();

        System.out.println(sb.capacity()); // 16
        System.out.println(sb.length()); // 0

        sb.append("sanjay");
        sb.append("verma");

        System.out.println(sb);

        System.out.println(sb.charAt(3)); // j

        sb.deleteCharAt(6);
        System.out.println(sb); // sanjayverma

        sb.setCharAt(3, 'i');
        System.out.println(sb); // saniavverma

        StringBuffer sb1 = new StringBuffer("Sanjay");
        StringBuffer sb2 = new StringBuffer("verma");
        System.out.println(sb1.equals(sb2)); // false, because equals() is not overridden in StringBuffer

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