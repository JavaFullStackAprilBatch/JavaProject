package paymentmethod;

public class PaypalPayment implements IpaymentMethod{
    String CustomerName; double payPalAccount;
    PaypalPayment(String CustomerName, double payPalAccount){

    }

    @Override
    public void processPayment(int amount) {
        System.out.println("Payment processed from paypal to " + CustomerName +"amount "+amount);

    }

    @Override
    public void refundPayment(int amount) {
        System.out.println(CustomerName+" your amount has been refunded from paypal. The refund amount is "+ amount);

    }
}
