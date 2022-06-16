public enum BedroomType {

    SINGLE(1, 40),
    DOUBLE(2, 60),
    FAMILY(3, 70);

    private final int capacity;
    private final int nightlyRate;

    BedroomType(int capacity, int nightlyRate) {
        this.capacity = capacity;
        this.nightlyRate = nightlyRate;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getNightlyRate() {
        return this.nightlyRate;
    }
}
