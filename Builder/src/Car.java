public class Car {
    public static class CarBuilder {
        private String color;
        private String brand;
        private int year;
        private int price;

        public CarBuilder() {}

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
            return new Car(this);
        }
    }
    private String color;
    private String brand;
    private int year;
    private int price;

    private Car(CarBuilder builder) {
        this.color = builder.color;
        this.brand = builder.brand;
        this.year = builder.year;
        this.price = builder.price;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    private Car() {}
}
