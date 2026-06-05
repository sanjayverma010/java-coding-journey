class TotalEarning extends Thread {

    int total = 0;

    public void run() {

        synchronized (this) {

            for (int i = 1; i <= 10; i++) {

                total = total + 100;
            }

            // notify waiting thread
            this.notify();
        }
    }
}

public class MovieSeatBook {

    public static void main(String[] args) throws InterruptedException {

        TotalEarning te = new TotalEarning();

        te.start();

        synchronized (te) {

            // main thread waits
            te.wait();

            System.out.println("Total earning : " + te.total);
        }
    }
}