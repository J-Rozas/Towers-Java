public enum BedroomType {

    SINGLE(1),
    DOUBLE(2),
    FAMILY(3);

    private final int capacity;

    BedroomType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
