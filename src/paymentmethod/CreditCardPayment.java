package paymentmethod;

public class CreditCardPayment implements IpaymentMethod{
    String costumerName; double cardNo;
    CreditCardPayment (String costumerName, double cardNo ){
        this.costumerName=costumerName;
        this.cardNo=cardNo;
    }


    @Override
    public void processPayment(int amount) {
        System.out.println("Payment processed from creditcard to " + costumerName + "amount " + amount);

    }

    @Override
    public void refundPayment(int amount) {
        System.out.println("refunded payment from creditcard to: " + costumerName + "amount  " + amount);

    }
}
