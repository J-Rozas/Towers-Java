import java.util.ArrayList;

public class Bedroom extends Room {

    private final BedroomType bedroomType;
    private final ArrayList<Guest> collectionOfGuests;

    public Bedroom(BedroomType bedroomType, int capacity) {
        super(capacity);
        this.bedroomType = bedroomType;
        this.collectionOfGuests = new ArrayList<>();
    }

    public BedroomType getBedroomType() {
        return this.bedroomType;
    }
}
