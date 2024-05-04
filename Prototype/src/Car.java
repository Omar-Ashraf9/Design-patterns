public class Car extends Vehicle{
    private int topSpeed;
    private int horsePower;

    public Car() {
        super();
        this.topSpeed = 0;
        this.horsePower = 0;
    }

    public Car(Car car) {
        super(car);
        this.topSpeed = car.topSpeed;
        this.horsePower = car.horsePower;
    }


    @Override
    public Vehicle clone() {
        return new Car(this);
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTop Speed: " + topSpeed + "\nHorse Power: " + horsePower;
    }
}
