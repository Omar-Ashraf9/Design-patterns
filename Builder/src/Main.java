public class Main {
    public static void main(String[] args) {
        Car.CarBuilder carBuilder = new Car.CarBuilder();

        Car car = carBuilder.Color("Red")
                            .Brand("Toyota")
                            .Year(2020)
                            .Price(20000)
                            .build();

        System.out.println("Color: " + car.getColor());
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Year: " + car.getYear());
        System.out.println("Price: " + car.getPrice());


    }
}