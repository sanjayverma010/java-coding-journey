public class Exceptionprintmathods {
    public static void main(String[] args) {
        try{
            int a =100;
            int b = 0;
            int c;
            c = a/b;
        }
        catch(Exception e){
           e.printStackTrace(); // it can print exception name description and stack trace  MOST USED MATHOD
            System.out.println(e); // this mathod print only exception name and description 
            System.out.println(e.toString()); // this mathod print only exception name and description 
            System.out.println(e.getMessage());  // this mathos can only print descrition 
        }
    }
}
