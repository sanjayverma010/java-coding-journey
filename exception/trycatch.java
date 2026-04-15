// USING TRY-CATCH BLOCK HANDING EXICUTION TIME AND RUN TIME EXCEPTION  

import java.io.File;

class trycatch {
    public static void main(String[] args) {
        // int a=100;
        // int b=3;
        // int c;
        // try{
        // c = a/b;
        // System.out.println(c);
        // }
        // catch(ArithmeticException e){
        // System.out.println(e);

        // }

        try {

            // FileInputStream fil = new FileInputStream("c:Desktop.txt");

            Class.forName("Com.Mysql.jdbc.Driver");
        } catch (Exception e) {
            System.out.println(e);

        }

    }
}
