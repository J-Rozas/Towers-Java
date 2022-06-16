import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;
    private Guest guest;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom("Grand Room", 200);
        guest = new Guest("Joe");
    }

    @Test
    public void hasName() {
        assertEquals("Grand Room", conferenceRoom.getName());
    }

    @Test
    public void hasCapacity() {
        assertEquals(200, conferenceRoom.getCapacity());
    }

    @Test
    public void hasCollectionOfGuests() {
        assertEquals(new ArrayList<>(), conferenceRoom.getCollectionOfGuests());
    }

}
