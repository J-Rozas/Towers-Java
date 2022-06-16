import java.util.ArrayList;

public abstract class Room {

    private final int capacity;
    private final ArrayList<Guest> collectionOfGuests;

    public Room(int capacity) {
        this.capacity = capacity;
        this.collectionOfGuests = new ArrayList<>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public ArrayList<Guest> getCollectionOfGuests() {
        return this.collectionOfGuests;
    }

    public int getNumberOfGuests() {
        return this.collectionOfGuests.size();
    }
}
