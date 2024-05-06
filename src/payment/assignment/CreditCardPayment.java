package payment.assignment;

public class CreditCardPayment implements PaymentMethod {
    double amount;
    CreditCardPayment(double amount){
        this.amount=amount;

    }
    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment of $"+amount);
    }

    @Override
    public void refundPayment() {
            System.out.println("Refunding to the credit card : $" +amount);
        }


    }

