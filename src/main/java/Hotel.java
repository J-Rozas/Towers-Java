import java.util.ArrayList;

public class Hotel {

    private final ArrayList<Bedroom> bedroomCollection;
    private final ArrayList<ConferenceRoom> conferenceRoomCollection;

    public Hotel() {
        this.bedroomCollection = new ArrayList<>();
        this.conferenceRoomCollection = new ArrayList<>();
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
}