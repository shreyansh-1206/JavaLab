package OOPS;

abstract class Booking {
    abstract void book(String id, int amt);
    abstract void cancel(String id, int refund);
}

class CabBooking extends Booking {
    void book(String id, int amt) {
        System.out.println("CAB BOOKED WITH ID " + id + " FOR " + amt);
    }
    void schedule(String id, String time) {
        System.out.println("CAB " + id + " SCHEDULED AT " + time);
    }
    void cancel(String id, int refund) {
        System.out.println("CAB " + id + " CANCELLED. REFUND: " + refund);
    }
}

class TrainBooking extends Booking {
    void book(String id, int amt) {
        System.out.println("TRN BOOKED WITH ID " + id + " FOR " + amt);
    }
    void cancel(String id, int refund) {
        System.out.println("TRN " + id + " CANCELLED. REFUND: " + refund);
    }
}

class BusBooking extends Booking {
    void book(String id, int amt) {
        System.out.println("BUS BOOKED WITH ID " + id + " FOR " + amt);
    }
    void cancel(String id, int refund) {
        System.out.println("NO CANCELLATION ALLOWED FOR BUS BOOKING");
    }
}

public class QuickRide extends CabBooking {
    public static void main(String[] args) {
        try {
            QuickRide q = new QuickRide();
            q.book("CAB101", 500);
            q.schedule("CAB101", "10 AM");
            q.cancel("CAB101", 300);

            TrainBooking t = new TrainBooking();
            t.book("TRN202", 1200);
            t.cancel("TRN202", 1000);

            BusBooking b = new BusBooking();
            b.book("BUS303", 200);
        } catch (Exception e) {
            System.out.println("SOMETHING WENT WRONG");
        }
    }
}
