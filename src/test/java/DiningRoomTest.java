import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    private DiningRoom diningRoom;

    @Before
    public void before() {
        diningRoom = new DiningRoom("Main restaurant", 40);
    }

    @Test
    public void hasName() {
        assertEquals("Main restaurant", diningRoom.getName());
    }

    @Test
    public void hasCapacity() {
        assertEquals(40, diningRoom.getCapacity());
    }

    @Test
    public void hasGuests() {
        assertEquals(new ArrayList<Guest>(),  diningRoom.getGuests());
    }
}
