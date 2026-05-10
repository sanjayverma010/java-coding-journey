public class DeamonThread extends Thread {
    public void run()
    {
        System.out.println(Thread.currentThread().isDaemon());
    }

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());
        DeamonThread dt = new DeamonThread();
        dt.setDaemon(true);
        dt.start();
    }
}
