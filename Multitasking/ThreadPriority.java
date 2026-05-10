public class ThreadPriority extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(10);
        
        ThreadPriority tp = new ThreadPriority();
        tp.start();
    }
}
