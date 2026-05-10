public class StringMathods {
    public static void main(String[] args) {
        
        //String name = "";
        //System.out.println(name.length());
        //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null  at StringMathods.main(StringMathods.java:5)
       
        // String name = "";

        // String s1 = name.trim();
        // System.out.println(name.length());

        // if (name.trim().length() == 0){
        //     System.out.println("invalid name");
        // }
        // else{
        //     System.out.println(name);
        // }

        String name = "sanjay";

       //  String s1 = name.isEmpty();

        if (name.isEmpty() == true)
        {
            System.out.println("string is empty");
        }
        else{
            System.out.println("valid name");
        }
    }
}
