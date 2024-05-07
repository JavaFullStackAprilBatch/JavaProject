package payment.assignment;


public class CashPayment implements PaymentMethod {
    double amount;
    CashPayment(double amount){
        this.amount=amount;
    }
    @Override
    public void processPayment() {
        System.out.println("Processing the cash payment of $"+amount);

    }

    @Override
    public void refundPayment() {
        System.out.println("Refunding the cash payment of : $"+amount);

    }
}
