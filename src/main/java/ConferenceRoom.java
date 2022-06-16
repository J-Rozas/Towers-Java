import java.util.ArrayList;

public class ConferenceRoom extends Room {

    private final String name;
    private ArrayList<Guest> collectionOfGuests;

    public ConferenceRoom(String name, int capacity) {
        super(capacity);
        this.name = name;
        this.collectionOfGuests = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }
}