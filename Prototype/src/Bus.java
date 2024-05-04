public class Bus extends Vehicle{
    private int capacity;
    private int numberOfPassengers;

    public Bus() {
        super();
        this.capacity = 0;
        this.numberOfPassengers = 0;
    }

    public Bus(Bus bus) {
        super(bus);
        this.capacity = bus.capacity;
        this.numberOfPassengers = bus.numberOfPassengers;
    }

    @Override
    public Vehicle clone() {
        return new Bus(this);
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCapacity: " + capacity + "\nNumber of Passengers: " + numberOfPassengers;
    }
}
