public class YieldMathod extends Thread {
    public void run()
    {
        System.out.println("Yeild mathod");
        for(int i=1; i<=5; i++)
        {
            System.out.println(i + " "+ Thread.currentThread().getName());
        }

        
    }
    public static void main(String[] args)
        {
            YieldMathod ym = new YieldMathod();
            ym.start();

            

            for(int i=0; i<=5; i++)
            {
                Thread.yield();
                System.out.println(Thread.currentThread().getName()+ i);
            }
        }
}
