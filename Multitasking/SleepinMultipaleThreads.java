public class SleepinMultipaleThreads extends Thread {
    public void run()
    {
        try{

        for(int i=1; i<=5; i++)
        {
            System.out.println(i + Thread.currentThread().getName());
            Thread.sleep(1000);
            
        }

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    
    }

    public static void main(String[] args) {

    SleepinMultipaleThreads st = new SleepinMultipaleThreads();
    st.start();
    
    SleepinMultipaleThreads st1= new SleepinMultipaleThreads();
    st1.start();
    
    }
}
