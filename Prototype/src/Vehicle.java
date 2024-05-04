public abstract class Vehicle {
    private String brand;
    private String model;
    private String color;

    protected Vehicle(Vehicle vehicle) {
        this.brand = vehicle.brand;
        this.model = vehicle.model;
        this.color = vehicle.color;
    }

    public Vehicle() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.color = "Unknown";
    }

    public abstract Vehicle clone();

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + "\nModel: " + model + "\nColor: " + color;
    }
}

