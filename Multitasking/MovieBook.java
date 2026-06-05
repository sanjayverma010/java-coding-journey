class StaticSynchronization {

    static int totalSeats = 20;

    static synchronized void bookSeat(int seats) {

        if (totalSeats >= seats) {

            System.out.println(Thread.currentThread().getName()
                    + " Seats booked successfully");

            totalSeats = totalSeats - seats;

            System.out.println("Seats left : " + totalSeats);

        } else {

            System.out.println(Thread.currentThread().getName()
                    + " Seats cannot be booked");

            System.out.println("Seats left : " + totalSeats);
        }
    }
}

// Thread1
class Thread1 extends Thread {

    StaticSynchronization s;
    int seats;

    Thread1(StaticSynchronization s, int seats) {
        this.s = s;
        this.seats = seats;
    }

    public void run() {
        s.bookSeat(seats);
    }
}

// Thread2
class Thread2 extends Thread {

    StaticSynchronization s;
    int seats;

    Thread2(StaticSynchronization s, int seats) {
        this.s = s;
        this.seats = seats;
    }

    public void run() {
        s.bookSeat(seats);
    }
}

// Main class
public class MovieBook {

    public static void main(String[] args) {

        StaticSynchronization s1 = new StaticSynchronization();

        Thread1 t1 = new Thread1(s1, 8);
        Thread2 t2 = new Thread2(s1, 10);

        t1.start();
        t2.start();
    }
}