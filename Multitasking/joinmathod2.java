class step1 extends Thread{
    public void run()
    {
        try{
        System.out.println("begning the process");
        Thread.sleep(3000);
        System.out.println("first process end");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}

class step2 extends Thread {
      public void run()
    {
        try{
        System.out.println("Second process start");
        Thread.sleep(3000);
        System.out.println("Second process end");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    } 
}

class step3 extends Thread {
      public void run()
    {
        try{
        System.out.println("third process start");
        Thread.sleep(3000);
        System.out.println("Third process end");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
public class joinmathod2 extends Thread{
    public static void main(String[] args) throws InterruptedException {
        
        step1 st1 = new step1();
        st1.start();

        st1.join();

        step2 st2 = new step2();
        st2.start();

        st2.join();

        step3 st3 = new step3();
        st3.start();
    }
}