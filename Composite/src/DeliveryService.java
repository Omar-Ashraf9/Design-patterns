public class DeliveryService {
    private Box box;

    public void setUpOrder(Box... boxes) {
        box = new CompositeBox(boxes);
    }

    public double calculateTotalPrice() {
        return box.calculatePrice();
    }
}
