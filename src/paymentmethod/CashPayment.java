package paymentmethod;

public class CashPayment implements IpaymentMethod {
    String CostumerName;

    CashPayment(String CostumerName) {
        this.CostumerName = CostumerName;
    }

    @Override
    public void processPayment(int amount) {
        System.out.println("Payment processed to " + CostumerName + " is amount " + amount);
    }

    @Override
    public void refundPayment(int amount) {
        System.out.println(CostumerName + " your amount "+ amount + " has been refunded");

    }
}
