public class PaymentService {
    private int cost;
    private PaymentStrategy paymentStrategy;
    private boolean includeTaxes;

    public PaymentService(int cost, boolean includeTaxes){
        this.cost = cost;
        this.includeTaxes = includeTaxes;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void processOrder(){
        if(paymentStrategy.validatePaymentDetails()){
            paymentStrategy.pay(getTotal());
        } else {
            System.out.println("Payment details are invalid. Please try again.");
        }
    }

    public int getTotal(){
        return includeTaxes ? cost + cost/10 : cost;
    }
}
