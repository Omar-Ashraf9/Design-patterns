public class CarBuilder {
    private String color;
    private String brand;
    private int year;
    private int price;

    public CarBuilder Color(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder Brand(String brand) {
        this.brand = brand;
        return this;
    }

    public CarBuilder Year(int year) {
        this.year = year;
        return this;
    }

    public CarBuilder Price(int price) {
        this.price = price;
        return this;
    }

    public Car build() {
        Car car = new Car();
        car.setColor(color);
        car.setBrand(brand);
        car.setYear(year);
        car.setPrice(price);
        return car;
    }
}
