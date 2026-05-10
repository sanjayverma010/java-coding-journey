class Synchronization extends Thread {
    int total_seats = 10;

    synchronized void run(int seats) {
        if (total_seats >= seats) {
            System.out.println("Seats booked successfully");
            total_seats = total_seats - seats;
            System.out.println("Seats left " + total_seats);
        } else {
            System.out.println("Seats cannot be booked");
            System.out.println("Seats left " + total_seats);
        }
    }
}

class BookApp extends Thread {
    static Synchronization b;
    int seat;

    public void run() {
        b.run(seat);
    }

    public static void main(String[] args) {
        b = new Synchronization();

        BookApp sanjay = new BookApp();
        sanjay.seat = 7;
        sanjay.start();

        BookApp yash = new BookApp();
        yash.seat = 4;
        yash.start();
    }
}

// BEFOR SYNCHRONIZATION
// Seats booked successfully
// Seats booked successfully
// Seats left 3
// Seats left -1

// AFTER SYNCHRONIZATION
// Seats booked successfully
// Seats left 3
// Seats cannot be booked
// Seats left 3