// fileinputsteam is a predifind exception which inherit inputoutput class 
// all exceptions are accur on run time not compile time 
// compiler only check and suggest may this exception accur on run time so check your resource 

import java.io.FileInputStream;

class excepaccur{
    public static void main(String[] args) {
      // compile time exception   
   // try{
        // FileInputStream fis = new FileInputStream("c:goot.txt");
   // }catch(Exception e){
      //  System.out.println(e);


      // RUN TIME EXCEPTION 

      int a = 100;
      int b = 0;
      int c;
      c = a/b; // in run time it can try to divid and give the arithmatic exception 
      System.out.println(c);

    }
  
}
