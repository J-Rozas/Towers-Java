import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private final ArrayList<Bedroom> bedroomCollection;
    private final ArrayList<ConferenceRoom> conferenceRoomCollection;
    private final HashMap<String, DiningRoom> diningRoomCollection;

    public Hotel() {
        this.bedroomCollection = new ArrayList<>();
        this.conferenceRoomCollection = new ArrayList<>();
        this.diningRoomCollection = new HashMap<>();
    }

    public ArrayList<Bedroom> getBedroomCollection() {
        return this.bedroomCollection;
    }

    public ArrayList<ConferenceRoom> getConferenceRoomCollection() {
        return this.conferenceRoomCollection;
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedroomCollection.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRoomCollection.add(conferenceRoom);
    }

    public void checkInGuest(Guest guest, ConferenceRoom desiredRoom) {
        desiredRoom.getCollectionOfGuests().add(guest);
    }

    public void checkOutGuest(Guest guest, ConferenceRoom desiredRoom) {
        desiredRoom.getCollectionOfGuests().remove(guest);
    }

    public Booking bookRoom(int daysBooked, Bedroom bedroom) {
        return new Booking(daysBooked, bedroom);
    }

    public HashMap<String,DiningRoom> getDiningRooms() {
        return this.diningRoomCollection;
    }

    public void addDiningRoom(DiningRoom diningRoom1) {
        this.diningRoomCollection.put(diningRoom1.getName(), diningRoom1);
    }

    public int getDiningRoomsNumber() {
        return this.diningRoomCollection.size();
    }
}