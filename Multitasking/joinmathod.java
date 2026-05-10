public class joinmathod extends Thread {
    static Thread mainThread;
    public void run() {
        
        try {
            mainThread.join();
            for (int i = 0; i <= 5; i++) {
                System.out.println("child thread"+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        
        joinmathod jm = new joinmathod();
        jm.start();
        mainThread = Thread.currentThread();

        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println("main thread"+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }
}
