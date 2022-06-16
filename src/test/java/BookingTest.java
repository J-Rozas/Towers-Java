import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking;
    private Bedroom bedroom;

    @Before
    public void before() {
        bedroom = new Bedroom(BedroomType.DOUBLE, BedroomType.DOUBLE.getCapacity());
        booking = new Booking(7, bedroom);
    }

    @Test
    public void shouldHaveBedroom() {
        assertEquals(bedroom, booking.getBedroom());
    }

    @Test
    public void shouldHaveBookedDays() {
        assertEquals(7, booking.getDaysBooked());
    }
}
