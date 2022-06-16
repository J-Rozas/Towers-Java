import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    private Bedroom bedroom;

    @Before
    public void before() {
        bedroom = new Bedroom(BedroomType.SINGLE, BedroomType.SINGLE.getCapacity());
    }

    @Test
    public void hasRoomType() {
        assertEquals(BedroomType.SINGLE, bedroom.getBedroomType());
    }

    @Test
    public void hasCapacity() {
        assertEquals(1, bedroom.getCapacity());
    }

    @Test
    public void hasCollectionOfGuests() {
        assertEquals(new ArrayList<>(), bedroom.getCollectionOfGuests());
    }

}
