public interface PaymentStrategy {
    void pay(int amount);
    boolean validatePaymentDetails();
}
