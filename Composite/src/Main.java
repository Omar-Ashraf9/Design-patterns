public class Main {
    public static void main(String[] args) {
        DeliveryService deliveryService = new DeliveryService();

        deliveryService.setUpOrder(
                new CompositeBox(
                        new Book("The Hobbit", 10.99),
                        new Book("The Fellowship of the Ring", 12.99),
                        new Book("The Two Towers", 12.99)
                ),
                new CompositeBox(
                        new VideoGame("The Legend of Zelda: Ocarina of Time", 30.15),
                        new VideoGame("Super Mario 64", 40.45),
                        new VideoGame("Conker's Bad Fur Day", 50.66)
                ),
                new Book("The Return of the King", 12.99)
        );

        System.out.println("Total price: $" + deliveryService.calculateTotalPrice());
    }
}