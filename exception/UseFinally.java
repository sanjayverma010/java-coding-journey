//  Finally always exicute 

public class UseFinally {
    public static void main(String[] args) {
        try{

            // RISKY CODE 
            int a = 100;
            int b = 2;
            int c;
            c = a/b;
            System.out.println(c);

        }
        catch(Exception e){
            // HANDLING CODE 
            System.out.println("Exception" + e);

        }
        finally{

            // ALWAYS EXICUTING CODE 
            // eg cleanup code 

            System.out.println("this is finallyu block");

        }
    }
}
