public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();

        car.setBrand("Toyota");
        car.setModel("Corolla");
        car.setColor("Red");
        ((Car) car).setTopSpeed(200);
        ((Car) car).setHorsePower(200);

        Vehicle bus = new Bus();

        bus.setBrand("Mercedes");
        bus.setModel("Sprinter");
        bus.setColor("White");
        ((Bus) bus).setCapacity(20);
        ((Bus) bus).setNumberOfPassengers(10);

        Vehicle carClone = car.clone();
        Vehicle busClone = bus.clone();

        System.out.println(car);
        System.out.println("=====================================");
        System.out.println(bus);
        System.out.println("=====================================");
        System.out.println(carClone);
        System.out.println("=====================================");
        System.out.println(busClone);
    }
}