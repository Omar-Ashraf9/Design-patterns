public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService(100, true);
        paymentService.setPaymentStrategy(new PayPalPayment("Hunter@gmail.com", "password"));
        paymentService.processOrder();

    }
}