// PERFORM SINGALE TASK FROM SINGLE THREAD 
public class Threadcreation extends Thread {
    public void run()  // OVERRIDE RUN MATHOD 
        {
          System.out.println("this is thread");  
        }
    public static void main(String[] args) {
        Threadcreation tc = new Threadcreation(); // CLASS OBJECT 
        tc.start();  // STARTING THREAD 
    }
}
