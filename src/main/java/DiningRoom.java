import java.util.ArrayList;

public class DiningRoom extends Room {

    private final String name;
    private final ArrayList<Guest> collectionOfGuests;

    public DiningRoom(String name, int capacity) {
        super(capacity);
        this.name = name;
        this.collectionOfGuests = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }


    public ArrayList<Guest> getGuests() {
        return this.collectionOfGuests;
    }
}