public class CreditCardPayment implements PaymentStrategy{
    private CreditCard creditCard;

    public CreditCardPayment(String number, String date, String cvv) {
        creditCard = new CreditCard(number, date, cvv);
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using credit card.");
    }

    @Override
    public boolean validatePaymentDetails() {
        return creditCard.getNumber().length() == 16 && creditCard.getDate().length() == 5 && creditCard.getCvv().length() == 3;
    }
}
