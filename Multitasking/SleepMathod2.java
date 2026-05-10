public class SleepMathod2 extends Thread {
    public void run(){
    
        
            for(int i=1; i<= 5; i++)
            {  
                try{
                Thread.sleep(1000);
                System.out.println(i);
               }
            catch(Exception e){
                System.out.println(e);
            }
        } 
    }

    public static void main(String[] args) {
        SleepMathod2 sm = new SleepMathod2();
        sm.start();
    }
}

