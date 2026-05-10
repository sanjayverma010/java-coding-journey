// PERFORM SINGALE TASK FROM SINGLE THREAD
import java.lang.*;
public class ThreadcreationByinterface implements Runnable {
    public void run() // overriding is mandetory 
    {
        System.out.println("thread is theade by implement");
    }
    
    public static void main(String[] args) {
        ThreadcreationByinterface tb = new ThreadcreationByinterface();
        Thread th = new Thread(tb); // this is Thread class object 
        th.start();  // this ois mendatory step 
    }
}
