import java.util.ArrayList;

public abstract class Room {

    private final int capacity;
    private ArrayList<Guest> collectionOfGuests;

    public Room(int capacity) {
        this.capacity = capacity;
        this.collectionOfGuests = new ArrayList<>();
    }
}
