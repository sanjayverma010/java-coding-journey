public class SynchronizedBlock {

    int total_seats = 10;

    void run(int seats) {

        System.out.println("hii " + Thread.currentThread().getName());
        System.out.println("hii " + Thread.currentThread().getName());
        System.out.println("hii " + Thread.currentThread().getName());
        System.out.println("hii " + Thread.currentThread().getName());

        synchronized (this) {
        if (total_seats >= seats) {

            System.out.println("Seats booked successfully");

            total_seats = total_seats - seats;

            System.out.println("Seats left " + total_seats);

        } else {

            System.out.println("Seats cannot be booked");

            System.out.println("Seats left " + total_seats);
        }
    }

        System.out.println("hii " + Thread.currentThread().getName());
        System.out.println("hii " + Thread.currentThread().getName());
        System.out.println("hii " + Thread.currentThread().getName());
        System.out.println("hii " + Thread.currentThread().getName());
    }
}

class BookApp extends Thread {

    static SynchronizedBlock b;

    int seat;

    public void run() {

        b.run(seat);
    }

    public static void main(String[] args) {

        b = new SynchronizedBlock();

        BookApp sanjay = new BookApp();
        sanjay.seat = 7;
        sanjay.start();

        BookApp yash = new BookApp();
        yash.seat = 4;
        yash.start();
    }
}