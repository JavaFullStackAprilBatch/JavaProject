package payment.assignment;

public class PaymentMethodMain {
    public static void main(String[] args) {
        CreditCardPayment c=new CreditCardPayment(5000.0);
        PayPalPayment p=new PayPalPayment(7000.0);
        CashPayment c1=new CashPayment(3000.0);
        c.processPayment();
        c.refundPayment();
        p.processPayment();
        p.refundPayment();
        c1.processPayment();
        c1.refundPayment();
    }
}
