public class PayPalPayment implements PaymentStrategy{
    private String email;
    private String password;

    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using PayPal.");
    }

    @Override
    public boolean validatePaymentDetails() {
        return email.contains("@") && password.length() > 6;
    }
}
