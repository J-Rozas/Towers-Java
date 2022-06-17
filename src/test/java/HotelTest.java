import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom;
    private ConferenceRoom conferenceRoom;
    private Guest guest;
    private DiningRoom diningRoom1;
    private DiningRoom diningRoom2;

    @Before
    public void before() {
        hotel = new Hotel();
        bedroom = new Bedroom(BedroomType.DOUBLE, BedroomType.DOUBLE.getCapacity());
        conferenceRoom = new ConferenceRoom("Main Room", 500);
        guest = new Guest("Joe");
        diningRoom1 = new DiningRoom("Main restaurant", 40);
        diningRoom2 = new DiningRoom("Second restaurant", 15);
    }

    @Test
    public void hotelShouldHaveCollectionOfBedrooms() {
        assertEquals(new ArrayList<Bedroom>(), hotel.getBedroomCollection());
    }

    @Test
    public void hotelShouldHaveCollectionOfConferenceRooms() {
        assertEquals(new ArrayList<ConferenceRoom>(), hotel.getConferenceRoomCollection());
    }

    @Test
    public void shouldBeAbleToAddNewBedroom() {
        hotel.addBedroom(bedroom);
        assertEquals(new ArrayList<>(Collections.singletonList(bedroom)), hotel.getBedroomCollection());
    }

    @Test
    public void shouldBeAbleToAddNewConferenceRoom() {
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(new ArrayList<>(Collections.singletonList(conferenceRoom)), hotel.getConferenceRoomCollection());
    }

    @Test
    public void shouldBeAbleToCheckInGuestToRoom() {
        hotel.addConferenceRoom(conferenceRoom);
        hotel.checkInGuest(guest, conferenceRoom);
        assertEquals(1, conferenceRoom.getNumberOfGuests());
    }

    @Test
    public void shouldBeAbleToCheckOutGuestFromRoom() {
        hotel.addConferenceRoom(conferenceRoom);
        hotel.checkInGuest(guest, conferenceRoom);
        hotel.checkOutGuest(guest, conferenceRoom);
        assertEquals(0, conferenceRoom.getNumberOfGuests());
    }

    @Test
    public void shouldBeAbleToBookARoom() {
        Booking booking = hotel.bookRoom(4, bedroom);
        assertEquals("class Booking", booking.getClass().toString());
        assertEquals(4, booking.getDaysBooked());
        assertEquals(bedroom, booking.getBedroom());
    }

    @Test
    public void shouldHaveHashMapWithDiningRooms() {
        assertEquals(new HashMap<String, DiningRoom>(), hotel.getDiningRooms());
    }

    @Test
    public void shouldBeAbleToAddNewDiningRooms() {
        hotel.addDiningRoom(diningRoom1);
        hotel.addDiningRoom(diningRoom2);
        assertEquals(2, hotel.getDiningRoomsNumber());
        assertTrue(hotel.getDiningRooms().containsKey("Second restaurant"));
        assertTrue(hotel.getDiningRooms().containsValue(diningRoom2));
    }
}
