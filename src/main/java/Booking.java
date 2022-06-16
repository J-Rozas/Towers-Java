public class Booking {

    private final int daysBooked;
    private final Bedroom bedroom;

    public Booking(int daysBooked, Bedroom bedroom) {
        this.daysBooked = daysBooked;
        this.bedroom = bedroom;
    }

    public int getDaysBooked() {
        return this.daysBooked;
    }

    public Bedroom getBedroom() {
        return this.bedroom;
    }
}
