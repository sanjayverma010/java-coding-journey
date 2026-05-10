public class UpdateString {
    public static void main(String[] args) {
        String s = "this is demo";
        System.out.println(s.replace("is", "was")); // OUTPUT -- thwas was demo\
        System.out.println(s.replaceFirst("is", "was")); // thwas is demo
        System.out.println(s.replaceAll("is", "was")); // thwas was demo
        System.out.println(s.replaceAll("is(.)", "was")); // thwaswasdemo
        System.out.println(s.replaceAll("is(.*)", "was")); // thwas
    }
}
