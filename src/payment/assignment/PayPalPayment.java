package payment.assignment;

public class PayPalPayment implements PaymentMethod {
    double amount;
    PayPalPayment(double amount){
        this.amount=amount;
    }


    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment of $"+amount);

    }

    @Override
    public void refundPayment() {
        System.out.println("Refunding to the PayPal card : $"+amount);

    }
}
